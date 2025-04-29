package lista2.exercicio3;

public class Livro {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private int numero_paginas;
    private String genero;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_publicacao() {
        return this.ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public int getNumero_paginas() {
        return this.numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        if (numero_paginas < 0){
            throw new IllegalArgumentException("Numero de paginas invalido");
        }
        else {
            this.numero_paginas = numero_paginas;
        }
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String abrir(){
        return "Livro aberto";
    }

    public String fechar(){
        return "Livro fechado";
    }

    public int marcarPagina(int pagina) {
        return pagina;
    }

    public int avancarPagina(int paginaAtual) {
        if (paginaAtual == this.numero_paginas){
            return paginaAtual;
        }
        else{
            return paginaAtual + 1;
        }
    }

    public int retrocederPagina(int paginaAtual) {
        if (paginaAtual == 1){
            return paginaAtual;
        }
        else {
            return paginaAtual - 1;
        }
    }

}
