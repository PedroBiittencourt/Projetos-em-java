package lista4.exercicio6;

public abstract class Vaga {
    private int numero;
    private String placaVeiculo;

    public Vaga() {
        this.numero = 0;
        this.placaVeiculo = "";
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public abstract float calcularAluguel();
}
