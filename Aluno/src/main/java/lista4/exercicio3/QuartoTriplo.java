package lista4.exercicio3;

public class QuartoTriplo extends Reserva{

    public float calcularPreco(){
        return (getNumeroDias() * 100) + (getNumeroRefeicoes() * 10);
    }

}
