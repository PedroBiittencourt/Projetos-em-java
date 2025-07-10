package exercicioRelampagoSurpresaNumeroPi;

public class Curso {
    private Professor coordenacao;
    private Escola escola;
    private TipoEnsino tipoEnsino;

    public Professor getCoordenacao() {
        return this.coordenacao;
    }

    public void setCoordenacao(Professor coordenacao) {
        this.coordenacao = coordenacao;
    }

    public Escola getEscola() {
        return this.escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public TipoEnsino getTipoEnsino() {
        return this.tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public String getEscolaridadeCoordenador(){
            return this.coordenacao.getNomeEscolaridade();
    }

    public String getNomeEstadoEscola(){
        return this.escola.getNomeEstado();
    }

    public String getNomeCoordenador(){
        return this.coordenacao.getNome();
    }

    public String getNomeDiretor(){
        return this.escola.getNomeDiretor();
    }

    public String getNomeTipoEnsino(){
        return this.tipoEnsino.getNome();
    }

}
