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
        assertEquals("Livro aberto", livro.abrir());
    }

    @Test
    void deveFecharLivro() {
        assertEquals("Livro fechado", livro.fechar());
    }

    @Test
    void deveMarcarPagina() {
        assertEquals(1, livro.marcarPagina(1));
    }

    @Test
    void deveAvancarPagina() {
        assertEquals(2, livro.avancarPagina(1));
    }

    @Test
    void deveNaoAvancarPagina() {
        livro.setNumero_paginas(10);
        assertEquals(10, livro.avancarPagina(10));
    }

    @Test
    void deveRetrocederPagina() {
        assertEquals(1, livro.retrocederPagina(2));
    }

    @Test
    void deveNaoRetrocederPagina() {
        livro.setNumero_paginas(1);
        assertEquals(1, livro.avancarPagina(1));
    }

    @Test
    void deveVerificarNumeroDePaginasNegativo() {
        try{
            livro.setNumero_paginas(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Numero de paginas invalido",e.getMessage());
        }
    }

}