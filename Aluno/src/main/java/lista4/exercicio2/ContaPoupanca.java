package lista4.exercicio2;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(){
        super();
    }

    public float calcularSaldo() {
        return this.getSaldoDisponivel();
    }

    public String getTipoConta(){
        return "Poupança";
    }

}
