package lista1.exercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FuncionarioTest {
    Funcionario funcionario;

    @BeforeEach
    void setUp(){
        funcionario = new Funcionario();
    }

    @Test
    public void deveCalcularSalarioNovo(){
        funcionario.setSalarioAtual(1000);
        funcionario.setPorcentagemAumento(1);
        assertEquals(1010, funcionario.calcularSalarioNovo());
    }

    @Test
    public void deveVerificarSalarioInvalido(){
        try{
            funcionario.setSalarioAtual(0.0f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Salario invalido", e.getMessage());
        }
    }

    @Test
    public void deveVerificarPorcentagemNegativa(){
        try{
            funcionario.setPorcentagemAumento(-0.1f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals (e.getMessage(), "Porcentagem invalida");
        }
    }

    @Test
    public void deveCalcularValorAumento(){
        funcionario.setSalarioAtual(1000);
        funcionario.setPorcentagemAumento(1);
        assertEquals(10, funcionario.calcularValorAumento());
    }

}