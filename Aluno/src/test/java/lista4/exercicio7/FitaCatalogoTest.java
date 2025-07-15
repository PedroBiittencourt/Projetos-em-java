package lista4.exercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaCatalogoTest {

    @Test
    void deveCalcularValorEmprestimo(){
        FitaCatalogo fita = new FitaCatalogo();
        fita.setQuantidadeDiasEmprestimo(1);
        assertEquals(5, fita.calcularValorEmprestimo());
    }

    @Test
    void deveRetornarTipoFita(){
        FitaCatalogo fita = new FitaCatalogo();
        assertEquals("Fita Catalogo", fita.getTipoFita());
    }

}