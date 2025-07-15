package lista4.exercicio2;

public class ContaCorrenteNormal extends Conta{

    public ContaCorrenteNormal(){
        super();
    }

    public float calcularSaldo() {
        return this.getSaldoDisponivel();
    }

    public String getTipoConta(){
        return "Normal";
    }

}
