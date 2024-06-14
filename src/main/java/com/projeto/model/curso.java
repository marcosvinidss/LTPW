package model;

public class Curso {
    private int id;
    private String nomeCurso;
    private String coordenador;
    private String materias;
    private String statusCurso;

    // Construtor vazio necessário para algumas operações com frameworks como Hibernate
    public Curso() {
    }

    public Curso(String nomeCurso, String coordenador, String materias, String statusCurso) {
        this.nomeCurso = nomeCurso;
        this.coordenador = coordenador;
        this.materias = materias;
        this.statusCurso = statusCurso;
    }

    // Getters e Setters para todos os atributos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(String coordenador) {
        this.coordenador = coordenador;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getStatusCurso() {
        return statusCurso;
    }

    public void setStatusCurso(String statusCurso) {
        this.statusCurso = statusCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", coordenador='" + coordenador + '\'' +
                ", materias='" + materias + '\'' +
                ", statusCurso='" + statusCurso + '\'' +
                '}';
    }
}
