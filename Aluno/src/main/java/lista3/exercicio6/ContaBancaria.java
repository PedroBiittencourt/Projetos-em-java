package lista3.exercicio6;

public abstract class ContaBancaria {

    private int numeroConta;
    private float saldo;
    private String titular;

    public ContaBancaria(String titular,int numeroConta, float saldo){
        this.saldo = 0;
        this.numeroConta = 0;
        setSaldo(saldo);
        setNumeroConta(numeroConta);
        setTitular(titular);
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta <= 0){
            throw new IllegalArgumentException("Numero da conta invalido");
        }
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0){
            throw new IllegalArgumentException("Saldo invalido");
        }
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if (titular.trim().equals("")){
            throw new IllegalArgumentException("Nome de titular invalido");
        }
        this.titular = titular;
    }

    public abstract void depositar(float quantia);
    public abstract void sacar(float quantia);
    public abstract void calcularJuros();


}
