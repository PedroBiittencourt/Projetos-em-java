package lista3.exercicio2;

public class Diretor extends Funcionario{

    private float participacaoLucros;

    public Diretor(float salario){
        super(salario);
    }

    public float getBonus() {
        return this.participacaoLucros;
    }

    public void setParticipacaoLucros(float participacaoLucros) {
        if (participacaoLucros <= 0){
            throw new IllegalArgumentException("Participacao de lucros invalida");
        }
        this.participacaoLucros = participacaoLucros;
    }

    public float calcularPagamento(){
        if (this.participacaoLucros == 0){
            throw new IllegalArgumentException("Participacao de lucros invalido");
        }
        return getSalarioMensal() + this.participacaoLucros;
    }

}
