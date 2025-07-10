package lista4.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class ContribuinteTest {

    @Test
    void deveAlocarImovel(){
        Contribuinte contribuinte = new Contribuinte();
        Imovel casa1 = new Casa();
        contribuinte.alocar(casa1);
        assertEquals(1,contribuinte.getNumeroImoveis());
    }

    @Test
    void deveNaoAlocarImovelRepetido(){
        Contribuinte contribuinte = new Contribuinte();
        Imovel casa1 = new Casa();
        contribuinte.alocar(casa1);
        contribuinte.alocar(casa1);
        assertEquals(1,contribuinte.getNumeroImoveis());
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
        contribuinte1.alocar(casa1);
        contribuinte1.alocar(lote1);
        contribuinte1.alocar(apt1);
        ArrayList<Float> resposta = new ArrayList<Float>();
        resposta.add(80f);
        resposta.add(30f);
        resposta.add(40f);
        assertEquals(resposta, contribuinte1.obterValorImoveis());
    }



}