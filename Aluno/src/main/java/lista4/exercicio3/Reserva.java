package lista4.exercicio3;

public abstract class Reserva {

    private int numeroDias;
    private int numeroRefeicoes;

    public Reserva(){
        this.numeroDias = 0;
        this.numeroRefeicoes = 0;
    }

    public int getNumeroDias() {
        return this.numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        if (numeroDias <= 0){
            throw new IllegalArgumentException("Numero de dias invalido");
        }
        this.numeroDias = numeroDias;
    }

    public int getNumeroRefeicoes() {
        return this.numeroRefeicoes;
    }

    public void setNumeroRefeicoes(int numeroRefeicoes) {
        if (numeroRefeicoes < 0){
            throw new IllegalArgumentException("Numero de refeicoes invalido");
        }
        this.numeroRefeicoes = numeroRefeicoes;
    }

    public abstract float calcularPreco();

}
