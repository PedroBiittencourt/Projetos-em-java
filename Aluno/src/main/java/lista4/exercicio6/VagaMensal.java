package lista4.exercicio6;

public class VagaMensal extends Vaga {
    private int quantidadeMeses;

    public VagaMensal() {
        this.quantidadeMeses = 0;
    }

    public int getQuantidadeMeses() {
        return this.quantidadeMeses;
    }

    public void setQuantidadeMeses(int quantidadeMeses) {
        this.quantidadeMeses = quantidadeMeses;
    }

    public float calcularAluguel(){
        return (this.quantidadeMeses * 150);
    }
}
