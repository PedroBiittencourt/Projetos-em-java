package lista2.exercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    Livro livro;

    @BeforeEach
    void setUp() {
        livro = new Livro();
    }

    @Test
    void deveAbrirLivro() {
        livro.abrir();
        assertEquals(true, livro.getAberto());
    }

    @Test
    void deveFecharLivro() {
        livro.abrir();
        livro.fechar();
        assertEquals(false, livro.getAberto());
    }

    @Test
    void deveMarcarPagina() {
        livro.abrir();
        livro.setPagina_atual(1);
        assertEquals(1, livro.marcarPagina());
    }

    @Test
    void deveAvancarPagina() {
        livro.abrir();
        livro.setPagina_atual(1);
        livro.avancarPagina();
        assertEquals(2, livro.getPagina_atual());
    }

    @Test
    void deveNaoAvancarPagina() {
        try {
            livro.abrir();
            livro.setNumero_paginas(10);
            livro.setPagina_atual(10);
            livro.avancarPagina();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O livro ja atingiu o numero total de paginas", e.getMessage());
        }
    }

    @Test
    void deveRetrocederPagina() {
        livro.abrir();
        livro.setPagina_atual(2);
        livro.retrocederPagina();
        assertEquals(1, livro.getPagina_atual());
    }

    @Test
    void deveNaoRetrocederPagina() {
        try {
            livro.setNumero_paginas(1);
            livro.abrir();
            livro.retrocederPagina();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("O livro esta na primeira pagina", e.getMessage());
        }
    }

    @Test
    void deveVerificarNumeroDePaginasZeradoNegativo() {
        try{
            livro.setNumero_paginas(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Numero de paginas invalido",e.getMessage());
        }
    }

    @Test
    void deveNaoAbrirLivroAberto() {
        try{
            livro.abrir();
            livro.abrir();
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("O livro ja esta aberto", e.getMessage());
        }
    }

    @Test
    void deveNaoFecharLivroFechado() {
        try{
            livro.fechar();
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("O livro ja esta fechado", e.getMessage());
        }
    }

    @Test
    void deveNaoMarcarPaginaLivroFechado() {
        try{
            livro.marcarPagina();
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Nao eh possivel marcar pagina com livro fechado", e.getMessage());
        }
    }

    @Test
    void deveNaoAvancarPaginaLivroFechado() {
        try{
            livro.setNumero_paginas(2);
            livro.avancarPagina();
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Nao eh possivel avancar pagina com livro fechado", e.getMessage());
        }
    }

    @Test
    void deveNaoRetrocederPaginaLivroFechado() {
        try{
            livro.setNumero_paginas(2);
            livro.setPagina_atual(2);
            livro.retrocederPagina();
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Nao eh possivel retroceder pagina com livro fechado", e.getMessage());
        }
    }

}