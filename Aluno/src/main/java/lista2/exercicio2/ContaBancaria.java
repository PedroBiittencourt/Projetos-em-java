package lista2.exercicio2;

public class ContaBancaria {
    private String titular;
    private int numero_conta;
    private float saldo;

    public ContaBancaria() {
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        if (numero_conta < 0){
            throw new IllegalArgumentException("Numero da conta invalido");
        }
        this.numero_conta = numero_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if (saldo < 0){
            throw new IllegalArgumentException("Saldo invalido");
        }
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        if (valor < 0){
            throw new IllegalArgumentException("Valor invalido");
        }
        else {
            this.saldo += valor;
        }
    }

    public void sacar(float valor) {
        if (this.saldo < valor || valor < 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.saldo = this.saldo-valor;
    }

}
