package lista4.exercicio7;

public class FitaLancamento extends Fita {

    private float valorAluguelDiario;

    public FitaLancamento() {
        this.valorAluguelDiario = 0;
    }

    public float getValorAluguelDiario() {
        return this.valorAluguelDiario;
    }

    public void setValorAluguelDiario(float valorAluguelDiario) {
        this.valorAluguelDiario = valorAluguelDiario;
    }

    public float calcularValorEmprestimoFita() {
        return (this.quantidadeDiasEmprestimo * this.valorAluguelDiario);
    }
}
