package lista4.exercicio6;

public class VagaDiaria extends Vaga {
    private int quantidadeDias;

    VagaDiaria() {
        super();
        this.quantidadeDias = 0;
    }

    public int getQuantidadeDias() {
        return this.quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        if (quantidadeDias <= 0) {
            throw new IllegalArgumentException("Quantidade de dias invalida");
        }
        this.quantidadeDias = quantidadeDias;
    }

    public float calcularAluguel(){
        return (this.quantidadeDias * 10);
    }

    public String getTipoVaga(){
        return "Vaga diária";
    }

}
