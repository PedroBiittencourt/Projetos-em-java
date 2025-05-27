package lista3.exercicio2;

public abstract class Funcionario {

    private float salarioMensal;

    public Funcionario(float salario){
        setSalarioMensal(salario);
    }

    public float getSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal <= 0){
            throw new IllegalArgumentException("Salario invalido");
        }
        this.salarioMensal = salarioMensal;
    }

    public abstract float calcularPagamento();

}
