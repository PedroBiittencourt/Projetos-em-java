package lista4.exercicio7;

public class FitaCatalogo extends Fita {
    public FitaCatalogo() {
    }

    public float calcularValorEmprestimoFita() {
        return (this.quantidadeDiasEmprestimo * 5);
    }
}
