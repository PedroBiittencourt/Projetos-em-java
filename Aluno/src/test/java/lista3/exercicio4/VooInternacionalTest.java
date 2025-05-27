package lista3.exercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {

    @Test
    void deveVerificarFatorPrecoZeradoNegativo(){
        try{
            VooInternacional voo = new VooInternacional("Sao Paulo", "Nova York", 7400, "10/07/2025");
            voo.setFatorPrecoInternacional(0);
            voo.setTaxaConversao(1.13f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Fator de preco invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarTaxaConversaoZeradaNegativa(){
        try{
            VooInternacional voo = new VooInternacional("Sao Paulo", "Nova York", 7400, "10/07/2025");
            voo.setFatorPrecoInternacional(0.3f);
            voo.setTaxaConversao(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Taxa de conversao invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco(){
        VooInternacional voo = new VooInternacional("Sao Paulo", "Nova York", 7400, "10/07/2025");
        voo.setFatorPrecoInternacional(0.3f);
        voo.setTaxaConversao(1.13f);
        assertEquals(2508.6f, voo.calcularPreco(), 0.01f);
    }

    @Test
    void deveVerificarTaxaConversaoZeradaCalcularPreco(){
        try{
            VooInternacional voo = new VooInternacional("Sao Paulo", "Nova York", 7400, "10/07/2025");
            voo.setFatorPrecoInternacional(0.3f);
            voo.calcularPreco();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Taxa de conversao invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarFatorPrecoZeradoCalcularPreco(){
        try{
            VooInternacional voo = new VooInternacional("Sao Paulo", "Nova York", 7400, "10/07/2025");
            voo.setTaxaConversao(1.13f);
            voo.calcularPreco();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Fator preco invalido", e.getMessage());
        }
    }


}