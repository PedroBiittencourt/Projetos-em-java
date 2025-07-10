package lista4.exercicio7;

import java.util.Date;

public abstract class Fita {
    private Date data;
    private String nomeFilme;
    protected int quantidadeDiasEmprestimo;

    public Fita() {
        this.data = new Date();
        this.nomeFilme = "";
        this.quantidadeDiasEmprestimo = 0;
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
        this.nomeFilme = nomeFilme;
    }

    public int getQuantidadeDiasEmprestimo() {
        return this.quantidadeDiasEmprestimo;
    }

    public void setQuantidadeDiasEmprestimo(int quantidadeDiasEmprestimo) {
        this.quantidadeDiasEmprestimo = quantidadeDiasEmprestimo;
    }

    public abstract float calcularValorEmprestimoFita();
}
