package lista4.exercicio4;

public abstract class Frete {
    private int numero;
    private float valorFrete;
    private float taxaEntrega;

    public Frete() {
        this.numero = 0;
        this.valorFrete = 0;
        this.taxaEntrega = 0;
    }

    public float getTaxaEntrega() {
        return this.taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega) {
        if (taxaEntrega < 0) {
            throw new IllegalArgumentException("Valor de taxa de entrega invalido");
        }
        this.taxaEntrega = taxaEntrega;
    }


    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Numero de frete invalido");
        }
        this.numero = numero;
    }

    public float getValorFrete() {
        return this.valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        if (valorFrete <= 0) {
            throw new IllegalArgumentException("Valor de frete invalido");
        }
        this.valorFrete = valorFrete;
    }

    public abstract float calcularFrete();
}
