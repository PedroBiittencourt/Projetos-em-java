package exercicioRelampagoSurpresaNumeroPi;

public class Professor extends Pessoa{
    private String nome;
    private Curso contratacao;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public Curso getContratacao() {
        return this.contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public String getNomeDiretorEscola(){
        return this.contratacao.getNomeDiretor();
    }

    public String getNomeCoordenadorCurso(){
        return this.contratacao.getNomeCoordenador();
    }

    public String getNomeTipoEnsinoCurso(){
        return this.contratacao.getNomeTipoEnsino();
    }

}
