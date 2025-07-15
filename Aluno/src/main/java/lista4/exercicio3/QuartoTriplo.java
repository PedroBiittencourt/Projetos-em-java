package lista4.exercicio3;

public class QuartoTriplo extends Reserva{

    public QuartoTriplo(){
        super();
    }

    public float calcularPreco(){
        return (getNumeroDias() * 100) + (getNumeroRefeicoes() * 10);
    }

    public String getTipoReserva(){
        return "Quarto triplo";
    }

}
