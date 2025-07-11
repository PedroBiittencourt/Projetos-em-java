package lista4.exercicio3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {


    @Test
    void deveVerificarNomeInvalido(){
        try {
            Hospede hospede = new Hospede();
            hospede.setNome(" ");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarCodigoInvalido(){
        try {
            Hospede hospede = new Hospede();
            hospede.setCodigo(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveAlocarReserva(){
        Hospede hospede1 = new Hospede();
        Reserva reserva1 = new QuartoDuplo();
        hospede1.alocarReserva(reserva1);
        assertEquals(1, hospede1.getNumeroReservas());
    }

    @Test
    void deveNaoAlocarReservaRepetida(){
        Hospede hospede1 = new Hospede();
        Reserva reserva1 = new QuartoDuplo();
        hospede1.alocarReserva(reserva1);
        hospede1.alocarReserva(reserva1);
        assertEquals(1,hospede1.getNumeroReservas());
    }

    @Test
    void deveRetornarNumeroReservas(){
        Hospede hospede1 = new Hospede();
        Reserva reserva1 = new QuartoDuplo();
        Reserva reserva2 = new QuartoDuplo();
        hospede1.alocarReserva(reserva1);
        hospede1.alocarReserva(reserva2);
        assertEquals(2, hospede1.getNumeroReservas());
    }

    @Test
    void deveRetorarListaReservas(){
        QuartoDuplo reserva1 = new QuartoDuplo();
        QuartoSingle reserva2 = new QuartoSingle();
        QuartoTriplo reserva3 = new QuartoTriplo();

        Hospede hospede1 = new Hospede();
        hospede1.alocarReserva(reserva1);
        hospede1.alocarReserva(reserva2);
        hospede1.alocarReserva(reserva3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("Quarto duplo");
        resultadoEsperado.add("Quarto single");
        resultadoEsperado.add("Quarto triplo");

        assertEquals(resultadoEsperado, hospede1.listaReservas());
    }

    @Test
    void deveRetorarListaPrecoReservas(){
        QuartoDuplo reserva1 = new QuartoDuplo();
        QuartoSingle reserva2 = new QuartoSingle();
        QuartoTriplo reserva3 = new QuartoTriplo();

        reserva1.setNumeroDias(1);
        reserva1.setNumeroRefeicoes(1);
        reserva2.setNumeroDias(1);
        reserva3.setNumeroDias(1);
        reserva3.setNumeroRefeicoes(1);


        Hospede hospede1 = new Hospede();
        hospede1.alocarReserva(reserva1);
        hospede1.alocarReserva(reserva2);
        hospede1.alocarReserva(reserva3);

        ArrayList<Float> resultadoEsperado = new ArrayList<Float>();
        resultadoEsperado.add(90f);
        resultadoEsperado.add(50f);
        resultadoEsperado.add(110f);

        assertEquals(resultadoEsperado, hospede1.listaPrecoReservas());
    }

}