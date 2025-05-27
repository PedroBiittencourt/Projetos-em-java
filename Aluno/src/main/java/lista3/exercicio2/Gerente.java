package lista3.exercicio2;

public class Gerente extends Funcionario{

    private float bonus;

    public Gerente(float salario){
        super(salario);
    }

    public float getBonus() {
        return this.bonus;
    }

    public void setBonus(float bonus) {
        if (bonus <= 0){
            throw new IllegalArgumentException("Bonus invalido");
        }
        this.bonus = bonus;
    }

    public float calcularPagamento(){
        if (this.bonus == 0){
            throw new IllegalArgumentException("Bonus invalido");
        }
        return getSalarioMensal() + this.bonus;
    }

}
