package lista3.exercicio2;

public class FuncionarioComum extends Funcionario {

    public FuncionarioComum(float salario){
        super(salario);
    }

    public float calcularPagamento(){
        return getSalarioMensal();
    }

}
