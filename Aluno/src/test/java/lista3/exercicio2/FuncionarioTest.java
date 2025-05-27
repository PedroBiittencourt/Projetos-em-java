package lista3.exercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveVerificarSalarioZeradoNegativo(){
        try {
            Funcionario funcionario = new FuncionarioComum(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Salario invalido", e.getMessage());
        }
    }

}