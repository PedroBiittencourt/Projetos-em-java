package lista4.exercicio4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveVerificarNomeInvalido(){
        try {
            Cliente cliente = new Cliente();
            cliente.setNome(" ");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNomeValido(){
        Cliente cliente = new Cliente();
        cliente.setNome("Pedro");
    }


    @Test
    void deveVerificarCodigoInvalido(){
        try {
            Cliente cliente = new Cliente();
            cliente.setCodigo(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Codigo invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarCodigoValido(){
        Cliente cliente = new Cliente();
        cliente.setCodigo(1);
    }


    @Test
    void deveAlocarUmFrete(){
        Cliente cliente1 = new Cliente();
        Frete frete = new FreteNormal();
        cliente1.alocarFrete(frete);
        assertEquals(1, cliente1.getQuantidadeFretes());
    }

    @Test
    void deveNaoAlocarFreteRepetido(){
        Cliente cliente = new Cliente();
        Frete frete = new FreteNormal();
        cliente.alocarFrete(frete);
        cliente.alocarFrete(frete);
        assertEquals(1,cliente.getQuantidadeFretes());
    }

    @Test
    void deveAlocarZeroFretes(){
        Cliente cliente1 = new Cliente();
        assertEquals(0, cliente1.getQuantidadeFretes());
    }

    @Test
    void deveAlocarMaisDeUmFrete() {
        Cliente cliente = new Cliente();
        FreteNormal frete1 = new FreteNormal();
        FreteNormal frete2 = new FreteNormal();
        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);
        assertEquals(2, cliente.getQuantidadeFretes());
    }


    @Test
    void deveRetornarListaFretesCliente() {
        FreteNormal frete1 = new FreteNormal();
        FreteEspecial frete2 = new FreteEspecial();
        FreteUrgente frete3 = new FreteUrgente();

        Cliente cliente = new Cliente();
        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);
        cliente.alocarFrete(frete3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("Frete normal");
        resultadoEsperado.add("Frete especial");
        resultadoEsperado.add("Frete urgente");

        assertEquals(resultadoEsperado, cliente.retornarFretesCliente());
    }

    @Test
    void deveRetornarListaValoresFrete() {
        FreteNormal frete1 = new FreteNormal();
        frete1.setValorFrete(10);
        FreteEspecial frete2 = new FreteEspecial();
        frete2.setValorFrete(10);
        frete2.setTaxaEntrega(5);
        FreteUrgente frete3 = new FreteUrgente();
        frete3.setValorFrete(10);
        frete3.setTaxaEntrega(5);
        frete3.setQuantidadeItens(2);

        Cliente cliente = new Cliente();
        cliente.alocarFrete(frete1);
        cliente.alocarFrete(frete2);
        cliente.alocarFrete(frete3);

        ArrayList<Float> resultadoEsperado = new ArrayList<Float>();
        resultadoEsperado.add(10f);
        resultadoEsperado.add(15f);
        resultadoEsperado.add(35f);

        assertEquals(resultadoEsperado, cliente.retornarValoresFrete());
    }
}