package lista4.exercicio3;

public class QuartoDuplo extends Reserva{

    public QuartoDuplo(){
        super();
    }

    public float calcularPreco(){
        return (getNumeroDias() * 80) + (getNumeroRefeicoes() * 10);
    }

    public String getTipoReserva(){
        return "Quarto duplo";
    }

}
