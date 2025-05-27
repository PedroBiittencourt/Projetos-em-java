package lista3.exercicio4;

import lista3.exercicio3.Produto;
import lista3.exercicio3.ProdutoEletronico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void deveVerificarFatorPrecoZeradoNegativo(){
        try{
            VooDomestico voo = new VooDomestico("Sao Paulo", "Rio de Janeiro", 437, "10/07/2025");
            voo.setFatorPrecoDomestico(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Fator de preco invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco(){
        VooDomestico voo = new VooDomestico("Sao Paulo", "Rio de Janeiro", 437, "10/07/2025");
        voo.setFatorPrecoDomestico(0.7f);
        assertEquals(305.9, voo.calcularPreco(), 0.01f);
    }

    @Test
    void deveVerificarFatorPrecoZeradoCalcularPreco(){
        try{
            VooDomestico voo = new VooDomestico("Sao Paulo", "Rio de Janeiro", 437, "10/07/2025");
            voo.calcularPreco();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Fator preco invalido", e.getMessage());
        }
    }

}