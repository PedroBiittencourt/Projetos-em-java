package lista4.exercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaLancamentoTest {

    @Test
    void deveCalcularValorEmprestimo(){
        FitaLancamento fita = new FitaLancamento();
        fita.setQuantidadeDiasEmprestimo(1);
        fita.setValorAluguelDiario(2);
        assertEquals(2, fita.calcularValorEmprestimo());
    }

}