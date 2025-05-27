package lista3.exercicio1;

import lista3.exercicio2.Gerente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void deveVerificarRaioZeradoNegativo(){
        try{
            Circulo circulo = new Circulo();
            circulo.setRaio(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Raio invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularArea(){
        Circulo circulo = new Circulo();
        circulo.setRaio(1);
        assertEquals(3.14f, circulo.calcularArea());
    }

    @Test
    void deveVerificarRaioZeradoCalcularArea(){
        try{
            Circulo circulo = new Circulo();
            circulo.calcularArea();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Raio invalido", e.getMessage());
        }
    }

    @Test
    void deveCalcularPerimetro(){
        Circulo circulo = new Circulo();
        circulo.setRaio(1);
        assertEquals(6.28f, circulo.calcularPerimetro());
    }

    @Test
    void deveVerificarRaioZeradoCalcularPerimetro(){
        try{
            Circulo circulo = new Circulo();
            circulo.calcularPerimetro();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Raio invalido", e.getMessage());
        }
    }

}