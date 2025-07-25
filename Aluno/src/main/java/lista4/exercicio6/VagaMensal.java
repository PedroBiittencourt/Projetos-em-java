package lista4.exercicio6;

public class VagaMensal extends Vaga {
    private int quantidadeMeses;

    public VagaMensal() {
        super();
        this.quantidadeMeses = 0;
    }

    public int getQuantidadeMeses() {
        return this.quantidadeMeses;
    }

    public void setQuantidadeMeses(int quantidadeMeses) {
        if (quantidadeMeses <= 0) {
            throw new IllegalArgumentException("Quantidade de meses invalida");
        }
        this.quantidadeMeses = quantidadeMeses;
    }

    public float calcularAluguel(){
        return (this.quantidadeMeses * 150);
    }

    public String getTipoVaga(){
        return "Vaga mensal";
    }

}
