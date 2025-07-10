package exercicioRelampagoSurpresaNumeroPi;

public class Aluno extends Pessoa{

    private Curso curso;

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNomeEstadoCurso(){
        return this.curso.getNomeEstadoEscola();
    }

    public String getNomeCoordenadorCurso(){
        return this.curso.getNomeCoordenador();
    }

}
