package lista4.exercicio7;

public class FitaLancamento extends Fita {

    public FitaLancamento() {
        super();
    }

    public float calcularValorEmprestimo() {
        return (getQuantidadeDiasEmprestimo() * getValorAluguelDiario());
    }
}
