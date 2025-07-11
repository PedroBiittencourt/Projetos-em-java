package lista4.exercicio6;

public class VagaSemanal extends Vaga {
    private int quantidadeSemanas;

    public VagaSemanal() {
        super();
        this.quantidadeSemanas = 0;
    }

    public int getQuantidadeSemanas() {
        return this.quantidadeSemanas;
    }

    public void setQuantidadeSemanas(int quantidadeSemanas) {
        if (quantidadeSemanas <= 0) {
            throw new IllegalArgumentException("Quantidade de semanas invalida");
        }
        this.quantidadeSemanas = quantidadeSemanas;
    }

    public float calcularAluguel(){
        return (this.quantidadeSemanas * 40);
    }
}
