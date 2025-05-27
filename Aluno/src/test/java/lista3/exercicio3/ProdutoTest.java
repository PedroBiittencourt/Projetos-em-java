package lista3.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveVerificarPrecoZeradoNegativo(){
        try{
            Produto produto = new ProdutoEletronico(0, "Celular");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNomeInvalido(){
        try{
            Produto produto = new ProdutoEletronico(1, " ");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

}