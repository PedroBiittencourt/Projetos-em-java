package lista4.exercicio4;

public abstract class Frete {
    private int numero;
    private float valorFrete;

    public Frete() {
        this.numero = 0;
        this.valorFrete = 0;
    }
    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getValorFrete() {
        return this.valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        this.valorFrete = valorFrete;
    }

    public abstract float calcularFrete();
}
