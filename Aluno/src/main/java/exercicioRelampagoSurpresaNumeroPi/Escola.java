package exercicioRelampagoSurpresaNumeroPi;

public class Escola {
    private Professor direcao;
    private Cidade cidade;

    public Escola(Cidade cidade){
        this.setCidade(cidade);
    }

    public Professor getDirecao() {
        return this.direcao;
    }

    public void setDirecao(Professor direcao) {
        this.direcao = direcao;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getEscolaridadeDiretor(){
        return this.direcao.getNomeEscolaridade();
    }

    public String getNomeCidade(){
        return this.cidade.getNome();
    }

    public String getNomeEstado(){
        return this.cidade.getNomeEstado();
    }

    public String getNomeDiretor(){
        return this.direcao.getNome();
    }


}
