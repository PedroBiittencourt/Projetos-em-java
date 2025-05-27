package lista3.exercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveCalcularPagamento(){
        FuncionarioComum funcionario = new FuncionarioComum(0.01f);
        assertEquals(0.01f, funcionario.calcularPagamento());
    }

}