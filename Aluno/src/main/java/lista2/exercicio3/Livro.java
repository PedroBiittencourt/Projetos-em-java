package lista2.exercicio3;

public class Livro {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private int numero_paginas;
    private String genero;
    private boolean aberto;
    private int pagina_atual;

    public Livro() {
        this.aberto = false;
        this.pagina_atual = 1;
        this.numero_paginas = 1;
    }

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
        if (numero_paginas <= 0){
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

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public int getPagina_atual() {
        return this.pagina_atual;
    }

    public void setPagina_atual(int pagina_atual) {
        this.pagina_atual = pagina_atual;
    }

    public void abrir(){
        if (this.aberto == true){
            throw new IllegalArgumentException("O livro ja esta aberto");
        }
        this.aberto = true;
    }

    public void fechar(){
        if (this.aberto == false){
            throw new IllegalArgumentException("O livro ja esta fechado");
        }
        this.aberto = false;
    }

    public int marcarPagina() {
        if (this.aberto == false){
            throw new IllegalArgumentException("Nao eh possivel marcar pagina com livro fechado");
        }
        return this.pagina_atual;
    }

    public void avancarPagina() {
        if (this.pagina_atual == this.numero_paginas){
            throw new IllegalArgumentException("O livro ja atingiu o numero total de paginas");
        }
        if (this.aberto == false){
            throw new IllegalArgumentException("Nao eh possivel avancar pagina com livro fechado");
        }
        this.pagina_atual += 1;
    }

    public void retrocederPagina() {
        if (this.pagina_atual == 1){
            throw new IllegalArgumentException("O livro esta na primeira pagina");
        }
        if (this.aberto == false){
            throw new IllegalArgumentException("Nao eh possivel retroceder pagina com livro fechado");
        }
        this.pagina_atual -= 1;
    }

}
