package lista4.exercicio2;

public abstract class Conta {

    private float saldoDisponivel;

    public float getSaldoDisponivel() {
        return this.saldoDisponivel;
    }

    public void setSaldoDisponivel(float saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public abstract float calcularSaldo();


}
