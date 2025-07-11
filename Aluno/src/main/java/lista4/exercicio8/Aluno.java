package lista4.exercicio8;

public abstract class Aluno {
    private int matricula;
    private String nome;
    private String endereco;
    private Curso curso;

    public Aluno(Curso curso) {
        this.matricula = 0;
        this.curso = curso;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula <= 0) {
            throw new IllegalArgumentException("Matricula invalida");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.trim().isEmpty()){
            throw new IllegalArgumentException("Endereco invalido");
        }
        this.endereco = endereco;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getCodigoCurso() {
        return curso.getCodigo();
    }
}
