package lista3.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveVerificarMarcaInvalida(){
        try{
            Veiculo veiculo = new Carro("", "P1", 1);
        }
        catch (IllegalArgumentException e){
            assertEquals("Marca invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarModeloInvalido(){
        try{
            Veiculo veiculo = new Carro("McLaren", "", 1);
        }
        catch (IllegalArgumentException e){
            assertEquals("Modelo invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarPrecoBaseZeradoNegativo(){
        try{
            Veiculo veiculo = new Carro("McLaren", "P1", 0);
        }
        catch (IllegalArgumentException e){
            assertEquals("Preco invalido", e.getMessage());
        }
    }

}