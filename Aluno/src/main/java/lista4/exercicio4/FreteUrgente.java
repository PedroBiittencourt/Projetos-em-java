package lista4.exercicio4;

public class FreteUrgente extends Frete{
    private float taxaEntrega;
    private int quantidadeItens;

    public FreteUrgente() {
        this.taxaEntrega = 0;
        this.quantidadeItens = 0;
    }

    public float getTaxaEntrega() {
        return this.taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public float calcularFrete() {
        return (getValorFrete() + this.taxaEntrega + (this.quantidadeItens * 10));
    }
}
