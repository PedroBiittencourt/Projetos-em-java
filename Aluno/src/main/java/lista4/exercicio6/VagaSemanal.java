package lista4.exercicio6;

public class VagaSemanal extends Vaga {
    private int quantidadeSemanas;

    public VagaSemanal() {
        this.quantidadeSemanas = 0;
    }

    public int getQuantidadeSemanas() {
        return this.quantidadeSemanas;
    }

    public void setQuantidadeSemanas(int quantidadeSemanas) {
        this.quantidadeSemanas = quantidadeSemanas;
    }

    public float calcularAluguel(){
        return (this.quantidadeSemanas * 40);
    }
}
