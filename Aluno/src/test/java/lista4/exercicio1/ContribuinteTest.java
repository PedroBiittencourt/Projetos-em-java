package lista4.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class ContribuinteTest {


    @Test
    void deveVerificarNomeInvalido(){
        try{
            Contribuinte contribuinte = new Contribuinte();
            contribuinte.setNome(" ");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarCodigoInvalido(){
        try{
            Contribuinte contribuinte = new Contribuinte();
            contribuinte.setCodigo(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveAlocarImovel(){
        Contribuinte contribuinte = new Contribuinte();
        Imovel casa1 = new Casa();
        contribuinte.alocarImovel(casa1);
        assertEquals(1,contribuinte.getNumeroImoveis());
    }

    @Test
    void deveNaoAlocarImovelRepetido(){
        Contribuinte contribuinte = new Contribuinte();
        Imovel casa1 = new Casa();
        contribuinte.alocarImovel(casa1);
        contribuinte.alocarImovel(casa1);
        assertEquals(1,contribuinte.getNumeroImoveis());
    }

    @Test
    void deveRetornarNumeroImoveis(){
        Contribuinte contribuinte = new Contribuinte();
        Imovel casa1 = new Casa();
        Imovel casa2 = new Casa();
        contribuinte.alocarImovel(casa1);
        contribuinte.alocarImovel(casa2);
        assertEquals(2, contribuinte.getNumeroImoveis());
    }

    @Test
    void deveRetornarListaValorImoveis(){
        Casa casa1 = new Casa();
        casa1.setPrecoMetroQuadrado(30);
        casa1.setQuantidadeMetroQuadrado(1);
        Lote lote1 = new Lote();
        lote1.setPrecoMetroQuadrado(30);
        lote1.setQuantidadeMetroQuadrado(1);
        Apartamento apt1 = new Apartamento();
        apt1.setPrecoMetroQuadrado(40);
        apt1.setQuantidadeAndar(1);
        apt1.setQuantidadeMetroQuadrado(1);
        Contribuinte contribuinte1 = new Contribuinte();
        contribuinte1.alocarImovel(casa1);
        contribuinte1.alocarImovel(lote1);
        contribuinte1.alocarImovel(apt1);
        ArrayList<Float> resposta = new ArrayList<Float>();
        resposta.add(80f);
        resposta.add(30f);
        resposta.add(40f);
        assertEquals(resposta, contribuinte1.getValorImoveis());
    }

    @Test
    void deveRetornarListaImoveis() {
        Lote lote = new Lote();
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();

        Contribuinte contribuinte = new Contribuinte();
        contribuinte.alocarImovel(lote);
        contribuinte.alocarImovel(casa);
        contribuinte.alocarImovel(apartamento);

        ArrayList<String> resposta = new ArrayList<String>();
        resposta.add("Lote");
        resposta.add("Casa");
        resposta.add("Apartamento");
        assertEquals(resposta, contribuinte.getImoveisPorCliente());
    }

}