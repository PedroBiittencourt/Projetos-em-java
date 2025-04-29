package lista1.exercicio1;

public class Funcionario {
    private float salarioAtual;
    private float porcentagemAumento;

    public void setSalarioAtual(float salarioAtual){
        if (salarioAtual <= 0){
            throw new IllegalArgumentException("Salario invalido");
        }
        this.salarioAtual = salarioAtual;
    }

    public float getSalarioAtual(){
        return this.salarioAtual;
    }

    public void setPorcentagemAumento (float porcentagemAumento){
        if (porcentagemAumento < 0){
            throw new IllegalArgumentException("Porcentagem invalida");
        }
        this.porcentagemAumento = porcentagemAumento;
    }
    public float getPorcentagemAumento(){
        return this.porcentagemAumento;
    }

    public float calcularSalarioNovo(){
        return this.salarioAtual + (this.salarioAtual * (this.porcentagemAumento/100));
    }

    public float calcularValorAumento(){
        return this.calcularSalarioNovo() - this.salarioAtual;
    }

}
