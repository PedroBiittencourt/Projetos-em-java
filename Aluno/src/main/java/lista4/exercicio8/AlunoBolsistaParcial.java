package lista4.exercicio8;

public class AlunoBolsistaParcial extends Aluno {

    private float percentualDesconto;

    public AlunoBolsistaParcial(Curso curso) {
        super(curso);
    }


    public float getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(float percentualDesconto) {
        if (percentualDesconto > 50) {
            throw new IllegalArgumentException("O desconto nao pode ser maior que 50%");
        } if (percentualDesconto <= 0) {
            throw new IllegalArgumentException("Desconto invalido");
        }
            this.percentualDesconto = percentualDesconto;
    }

    public float calcularMensalidade() {
        return (getValorMensalidade() - (getValorMensalidade() * (this.percentualDesconto/100)));
    }

    public String getTipoAluno(){
        return "Bolsista parcial";
    }

    public String getDadosAluno(){
        return "Aluno: " + getNome() + ". Matricula: " + getMatricula() + ". Endereco: " + getEndereco() +
                ". Tipo: " + getTipoAluno() + ". Valor mensalidade: R$" + this.calcularMensalidade() +
                ". Percentual de desconto: " + this.percentualDesconto + "%" +
                ". Quantidade parcelas: " + getQuantidadeParcelas() + ".";
    }

}
