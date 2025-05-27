package lista3.exercicio7;

import java.util.Date;

public abstract class MaterialBiblioteca {
    private String titulo;
    private Date dataPublicacao;
    private int prazo;

        public MaterialBiblioteca(String titulo, Date dataPublicacao,int prazo){
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.trim().equals("")){
            throw new IllegalArgumentException("Titulo invalido");
        }
        this.titulo = titulo;
    }

    public Date getDataPublicacao() {
        return this.dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public int getPrazo() {
        return this.prazo;
    }

    public void setPrazo(int prazo) {
        if (prazo <= 0){
            throw new IllegalArgumentException("Prazo invalido");
        }
        this.prazo = prazo;
    }

    public abstract Date calcularDataDevolucao(Date dataEmprestimo);

}
