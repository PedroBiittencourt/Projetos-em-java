package lista3.exercicio4;

import lista3.exercicio3.Produto;
import lista3.exercicio3.ProdutoEletronico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooTest {

    @Test
    void deveVerificarOrigemInvalida(){
        try{
            Voo voo = new VooDomestico(" ", "Rio de Janeiro", 437, "10/07/2025");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Origem invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarDestinoInvalido(){
        try{
            Voo voo = new VooDomestico("Sao Paulo", "", 437, "10/07/2025");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Destino invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarDistanciaInvalida(){
        try{
            Voo voo = new VooDomestico("Sao Paulo", "Rio de Janeiro", 0, "10/07/2025");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Distancia invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarDataInvalida(){
        try{
            Voo voo = new VooDomestico("Sao Paulo", "Rio de Janeiro", 437, "");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Data invalida", e.getMessage());
        }
    }

    //Voo voo = new VooDomestico("Sao Paulo", "Rio de Janeiro", 437, "10/07/2025");
}