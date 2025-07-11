package lista4.exercicio7;

public class FitaCatalogo extends Fita {

    public FitaCatalogo() {
        super();
    }

    public float calcularValorEmprestimo() {
        return (getQuantidadeDiasEmprestimo() * 5);
    }
}
