package lista4.exercicio8;

public class AlunoBolsistaIntegral extends Aluno {

    private int quantidadeParcelasIsentas;

    public AlunoBolsistaIntegral(Curso curso) {
        super(curso);
        this.quantidadeParcelasIsentas = 0;
    }

    public int getQuantidadeParcelasIsentas() {
        return this.quantidadeParcelasIsentas;
    }

    public void setQuantidadeParcelasIsentas(int quantidadeParcelasIsentas) {
        if (quantidadeParcelasIsentas < 0) {
            throw new IllegalArgumentException("Parcelas invalidas");
        }
        this.quantidadeParcelasIsentas = quantidadeParcelasIsentas;
    }

    public String getTipoAluno(){
        return "Bolsista integral";
    }

    public String getDadosAluno(){
        return "Aluno: " + getNome() + ". Matricula: " + getMatricula() + ". Endereco: " + getEndereco() +
                ". Tipo: " + getTipoAluno() + ". Parcelas isentas: " + this.quantidadeParcelasIsentas + ".";
    }

}
