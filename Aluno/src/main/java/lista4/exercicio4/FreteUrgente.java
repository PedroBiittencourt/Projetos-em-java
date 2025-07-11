package lista4.exercicio4;

public class FreteUrgente extends Frete{

    private int quantidadeItens;

    public FreteUrgente() {
        super();
        this.quantidadeItens = 0;
    }

    public int getQuantidadeItens() {
        return this.quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        if (quantidadeItens <= 0) {
            throw new IllegalArgumentException("Quantidade de itens invalido");
        }
        this.quantidadeItens = quantidadeItens;
    }

    public float calcularFrete() {
        return (getValorFrete() + getTaxaEntrega() + (this.quantidadeItens * 10));
    }
}
