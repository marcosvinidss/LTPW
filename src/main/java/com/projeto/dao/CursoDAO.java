package com.exemplo.dao;

import com.exemplo.model.Curso;
import com.exemplo.util.ConexaoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {
    private Connection conexao;

    public CursoDAO() {
        this.conexao = ConexaoDB.getConexao(); // Obter conexão com o banco de dados
    }

    // Método para inserir um novo curso no banco de dados
    public boolean inserirCurso(Curso curso) {
        String sql = "INSERT INTO cursos (nome_curso, coordenador, materias, statuscurso) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, curso.getNomeCurso());
            stmt.setString(2, curso.getCoordenador());
            stmt.setString(3, curso.getMaterias());
            stmt.setString(4, curso.getStatusCurso());

            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para atualizar um curso existente no banco de dados
    public boolean atualizarCurso(Curso curso) {
        String sql = "UPDATE cursos SET nome_curso = ?, coordenador = ?, materias = ?, statuscurso = ? WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, curso.getNomeCurso());
            stmt.setString(2, curso.getCoordenador());
            stmt.setString(3, curso.getMaterias());
            stmt.setString(4, curso.getStatusCurso());
            stmt.setInt(5, curso.getId());

            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para excluir um curso do banco de dados
    public boolean excluirCurso(int id) {
        String sql = "DELETE FROM cursos WHERE id = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);

            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para buscar todos os cursos no banco de dados
    public List<Curso> listarCursos() {
        List<Curso> cursos = new ArrayList<>();
        String sql = "SELECT * FROM cursos";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Curso curso = new Curso();
                curso.setId(rs.getInt("id"));
                curso.setNomeCurso(rs.getString("nome_curso"));
                curso.setCoordenador(rs.getString("coordenador"));
                curso.setMaterias(rs.getString("materias"));
                curso.setStatusCurso(rs.getString("statuscurso"));
                cursos.add(curso);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return cursos;
    }

    // Método para buscar um curso pelo ID no banco de dados
    public Curso buscarCursoPorId(int id) {
        String sql = "SELECT * FROM cursos WHERE id = ?";
        Curso curso = null;

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                curso = new Curso();
                curso.setId(rs.getInt("id"));
                curso.setNomeCurso(rs.getString("nome_curso"));
                curso.setCoordenador(rs.getString("coordenador"));
                curso.setMaterias(rs.getString("materias"));
                curso.setStatusCurso(rs.getString("statuscurso"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return curso;
    }
}
