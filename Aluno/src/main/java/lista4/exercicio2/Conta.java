package lista4.exercicio2;

public abstract class Conta {

    private float saldoDisponivel;

    public Conta(){
        this.saldoDisponivel = 0;
    }

    public float getSaldoDisponivel() {
        return this.saldoDisponivel;
    }

    public void setSaldoDisponivel(float saldoDisponivel) {
        if (saldoDisponivel < 0) {
            throw new IllegalArgumentException("Saldo invalido");
        }
        this.saldoDisponivel = saldoDisponivel;
    }

    public abstract float calcularSaldo();
    public abstract String getTipoConta();

}
