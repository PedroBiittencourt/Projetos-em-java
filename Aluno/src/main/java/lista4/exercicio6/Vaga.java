package lista4.exercicio6;

public abstract class Vaga {
    private int numero;
    private String placaVeiculo;

    public Vaga() {
        this.numero = 0;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Numero invalido");
        }
        this.numero = numero;
    }

    public String getPlacaVeiculo() {
        return this.placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        if (placaVeiculo.trim().isEmpty()){
            throw new IllegalArgumentException("Placa invalida");
        }
        this.placaVeiculo = placaVeiculo;
    }

    public abstract float calcularAluguel();
    public abstract String getTipoVaga();
}
