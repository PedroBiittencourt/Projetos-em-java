package lista3.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveVerificarPrecoZeradoNegativo(){
        try{
            Produto produto = new ProdutoEletronico(0, "Celular", 1, 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNomeInvalido(){
        try{
            Produto produto = new ProdutoEletronico(1, " ", 1, 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarEstoqueZeradoNegativo(){
        try{
            Produto produto = new ProdutoEletronico(1, "Celular", 0, 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Estoque invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantidadeZeradaNegativa(){
        try{
            Produto produto = new ProdutoEletronico(1000, "Celular", 1, 1);
            produto.setQuantidade(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantidadeMaiorEstoque(){
        try{
            Produto produto = new ProdutoEletronico(1000, "Celular", 1, 1);
            produto.setQuantidade(2);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarEstoqueAposCompra(){
        Produto produto = new ProdutoEletronico(1000, "Celular", 1, 1);
        assertEquals(0, produto.getEstoque());
    }

}