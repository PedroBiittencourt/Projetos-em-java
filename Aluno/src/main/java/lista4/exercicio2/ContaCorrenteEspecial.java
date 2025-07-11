package lista4.exercicio2;

public class ContaCorrenteEspecial extends Conta{

    private float limiteCredito;

    public ContaCorrenteEspecial(){
        super();
        this.limiteCredito = 0;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        if (limiteCredito <= 0){
            throw new IllegalArgumentException("Limite de credito invalido");
        }
        this.limiteCredito = limiteCredito;
    }

    public float  calcularSaldo(){
        return getSaldoDisponivel() + this.limiteCredito;
    }

}