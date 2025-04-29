package lista1.exercicio2;
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
    public void deveCalcularSalarioLiquido(){
        funcionario.setSalarioBruto(90);
        funcionario.setValorHorasExtras(10);
        funcionario.setInss(8);
        assertEquals(92, funcionario.calcularSalarioLiquido());
    }

    @Test
    public void deveVerificarHorasExtrasNegativas(){
        try{
            funcionario.setValorHorasExtras(-0.1f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals (e.getMessage(),"Valor de horas extras invalido");
        }
    }

    @Test
    public void deveVerificarInssNegativo(){
        try{
        funcionario.setInss(-0.1f);
        fail();
        }
        catch(IllegalArgumentException e){
            assertEquals (e.getMessage(),"Valor de INSS invalido");
        }
    }

    @Test
    public void deveVerificarSalarioBrutoInvalido(){
        try{
            funcionario.setSalarioBruto(0.0f);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Valor de salario bruto invalido");
        }
    }

}