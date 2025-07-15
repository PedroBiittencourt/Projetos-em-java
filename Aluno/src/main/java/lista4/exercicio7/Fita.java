package lista4.exercicio7;

import java.util.Date;

public abstract class Fita {
    private Date data;
    private String nomeFilme;
    private int quantidadeDiasEmprestimo;
    private float valorAluguelDiario;

    public Fita() {
        this.data = new Date();
        this.quantidadeDiasEmprestimo = 0;
    }

    public float getValorAluguelDiario() {
        return this.valorAluguelDiario;
    }

    public void setValorAluguelDiario(float valorAluguelDiario) {
        if (valorAluguelDiario <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.valorAluguelDiario = valorAluguelDiario;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeFilme() {
        return this.nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        if (nomeFilme.trim().isEmpty()){
            throw new IllegalArgumentException("Nome de filme invalido");
        }
        this.nomeFilme = nomeFilme;
    }

    public int getQuantidadeDiasEmprestimo() {
        return this.quantidadeDiasEmprestimo;
    }

    public void setQuantidadeDiasEmprestimo(int quantidadeDiasEmprestimo) {
        if (quantidadeDiasEmprestimo <= 0) {
            throw new IllegalArgumentException("Quantidade de dias invalida");
        }
        this.quantidadeDiasEmprestimo = quantidadeDiasEmprestimo;
    }

    public abstract float calcularValorEmprestimo();
    public abstract String getTipoFita();
}
