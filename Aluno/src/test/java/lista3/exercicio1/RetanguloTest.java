package lista3.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void deveVerificarBaseZeradaNegativa(){
        try{
            Retangulo retangulo = new Retangulo();
            retangulo.setBase(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Base invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarAlturaZeradaNegativa(){
        try{
            Retangulo retangulo = new Retangulo();
            retangulo.setAltura(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Altura invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularArea(){
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(2);
        retangulo.setAltura(5);
        assertEquals(10, retangulo.calcularArea());
    }

    @Test
    void deveVerificarBaseZeradaCalcularArea(){
        try{
            Retangulo retangulo = new Retangulo();
            retangulo.setAltura(1);
            retangulo.calcularArea();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Base invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarAlturaZeradaCalcularArea(){
        try{
            Retangulo retangulo = new Retangulo();
            retangulo.setBase(1);
            retangulo.calcularArea();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Altura invalida", e.getMessage());
        }
    }

    @Test
    void deveCalcularPerimetro(){
        Retangulo retangulo = new Retangulo();
        retangulo.setBase(2);
        retangulo.setAltura(1);
        assertEquals(6, retangulo.calcularPerimetro());
    }

    @Test
    void deveVerificarBaseZeradaCalcularPerimetro(){
        try{
            Retangulo retangulo = new Retangulo();
            retangulo.setAltura(1);
            retangulo.calcularPerimetro();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Base invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarAlturaZeradaCalcularPerimetro(){
        try{
            Retangulo retangulo = new Retangulo();
            retangulo.setBase(1);
            retangulo.calcularPerimetro();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Altura invalida", e.getMessage());
        }
    }

}