package lista4.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void deveVerificarNumerosDiasInvalido(){
        try{
            Reserva reserva = new QuartoSingle();
            reserva.setNumeroDias(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Numero de dias invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNumerosDiasValido(){
            Reserva reserva = new QuartoSingle();
            reserva.setNumeroDias(1);
            assertEquals(1, reserva.getNumeroDias());
    }

    @Test
    void deveVerificarNumerosRefeicoesInvalido(){
        try{
            Reserva reserva = new QuartoSingle();
            reserva.setNumeroRefeicoes(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Numero de refeicoes invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarRefeicoesValido(){
        Reserva reserva = new QuartoSingle();
        reserva.setNumeroRefeicoes(1);
        assertEquals(1, reserva.getNumeroRefeicoes());
    }

}