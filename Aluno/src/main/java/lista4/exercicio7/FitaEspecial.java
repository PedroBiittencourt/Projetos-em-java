package lista4.exercicio7;

public class FitaEspecial extends Fita {

    private float valorAluguelDiario;

    public FitaEspecial() {
        super();
    }

    public float calcularValorEmprestimo() {
        return (getQuantidadeDiasEmprestimo() * getValorAluguelDiario());
    }

    public String getTipoFita(){
        return "Fita Especial";
    }

}
