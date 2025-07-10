package lista4.exercicio2;

public class ContaCorrenteEspecial extends Conta{

    private float limiteCredito;

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public float  calcularSaldo(){
        return getSaldoDisponivel() + this.limiteCredito;
    }

}