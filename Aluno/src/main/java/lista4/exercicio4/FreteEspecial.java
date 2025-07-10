package lista4.exercicio4;

public class FreteEspecial extends Frete{
    private float taxaEntrega;

    public FreteEspecial() {
        this.taxaEntrega = 0;
    }

    public float getTaxaEntrega() {
        return this.taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        this.taxaEntrega = taxaEntrega;
    }

    public float calcularFrete() {
        return (getValorFrete() + this.taxaEntrega);
    }
}
