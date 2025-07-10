package lista4.exercicio6;

public class VagaDiaria extends Vaga {
    private int quantidadeDias;

    VagaDiaria() {
        this.quantidadeDias = 0;
    }

    public int getQuantidadeDias() {
        return this.quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    public float calcularAluguel(){
        return (this.quantidadeDias * 10);
    }
}
