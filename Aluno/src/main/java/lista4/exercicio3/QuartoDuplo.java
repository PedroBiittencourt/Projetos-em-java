package lista4.exercicio3;

public class QuartoDuplo extends Reserva{

    public float calcularPreco(){
        return (getNumeroDias() * 80) + (getNumeroRefeicoes() * 10);
    }

}
