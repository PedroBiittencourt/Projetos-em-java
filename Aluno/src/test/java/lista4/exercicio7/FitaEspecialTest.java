package lista4.exercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaEspecialTest {

    @Test
    void deveCalcularValorEmprestimo(){
        FitaEspecial fita = new FitaEspecial();
        fita.setQuantidadeDiasEmprestimo(1);
        fita.setValorAluguelDiario(2);
        assertEquals(2, fita.calcularValorEmprestimo());
    }

    @Test
    void deveRetornarTipoFita(){
        FitaEspecial fita = new FitaEspecial();
        assertEquals("Fita Especial", fita.getTipoFita());
    }

}