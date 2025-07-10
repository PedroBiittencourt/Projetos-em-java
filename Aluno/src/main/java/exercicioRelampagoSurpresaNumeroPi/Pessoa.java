package exercicioRelampagoSurpresaNumeroPi;

public class Pessoa {
    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Cidade getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNomeEscolaridade() {
        if (this.escolaridade == null) {
            return "Pessoa sem escolaridade";
        }
        else {
            return this.escolaridade.getNome();
        }
    }

    public String getNomeCidadeNaturalidade() {
        if (this.naturalidade == null){
            throw new IllegalArgumentException("A pessoa nao possui cidade de naturalidade cadastrada");
        }
        return this.naturalidade.getNome();
    }

    public String getNomeEstadoNaturalidade() {
        return this.naturalidade.getNomeEstado();
    }

    public String getCidadeEstadoNaturalidade() {
        return this.naturalidade.getNome() + " - " + this.naturalidade.getNomeEstado();
    }

}
