package lista4.exercicio3;

public class QuartoSingle extends Reserva{

    public QuartoSingle(){
        super();
    }

    public float calcularPreco(){
        return getNumeroDias() * 50;
    }

}
