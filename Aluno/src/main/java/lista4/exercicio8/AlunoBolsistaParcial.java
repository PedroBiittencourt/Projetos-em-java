package lista4.exercicio8;

public class AlunoBolsistaParcial extends Aluno {

    private float valorMensalidade;
    private int quantidadeParcelas;
    private float percentualDesconto;

    public AlunoBolsistaParcial(Curso curso) {
        super(curso);
        this.valorMensalidade = 0;
        this.quantidadeParcelas = 0;
    }

    public float getValorMensalidade() {
        return this.valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        if (valorMensalidade <= 0) {
            throw new IllegalArgumentException("Valor de mensalidade invalida");
        }
        this.valorMensalidade = valorMensalidade;
    }

    public int getQuantidadeParcelas() {
        return this.quantidadeParcelas;
    }

    public void setQuantidadeParcelas(int quantidadeParcelas) {
        if (quantidadeParcelas <= 0) {
            throw new IllegalArgumentException("Quantidade de parcelas invalida");
        }
        this.quantidadeParcelas = quantidadeParcelas;
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
        return (this.valorMensalidade - (this.valorMensalidade * (this.percentualDesconto/100)));
    }

}
