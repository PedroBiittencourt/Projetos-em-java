package lista4.exercicio6;

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
    void deveAlocarUmaVaga() {
        Vaga vaga1 = new VagaDiaria();
        Cliente cliente = new Cliente();
        cliente.alocarVaga(vaga1);
        assertEquals(1, cliente.getNumeroVagas());
    }

    @Test
    void deveNaoAlocarVagaRepetida(){
        Cliente cliente = new Cliente();
        Vaga vaga1 = new VagaDiaria();
        cliente.alocarVaga(vaga1);
        cliente.alocarVaga(vaga1);
        assertEquals(1,cliente.getNumeroVagas());
    }

    @Test
    void deveAlocarZeroVagas() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.getNumeroVagas());
    }

    @Test
    void deveAlocarMaisDeUmaVaga(){
        Cliente cliente = new Cliente();
        Vaga vaga1 = new VagaDiaria();
        Vaga vaga2 = new VagaDiaria();
        cliente.alocarVaga(vaga1);
        cliente.alocarVaga(vaga2);
        assertEquals(2, cliente.getNumeroVagas());
    }

    @Test
    void deveRetornarListaVagasCliente() {
        VagaDiaria vaga = new VagaDiaria();
        VagaSemanal vaga1 = new VagaSemanal();
        VagaMensal vaga2 = new VagaMensal();

        Cliente cliente = new Cliente();
        cliente.alocarVaga(vaga);
        cliente.alocarVaga(vaga1);
        cliente.alocarVaga(vaga2);

        ArrayList<String> esperado = new ArrayList<String>();
        esperado.add("Vaga diária");
        esperado.add("Vaga semanal");
        esperado.add("Vaga mensal");

        assertEquals(esperado, cliente.listaVagas());
    }

    @Test
    void deveRetornarListaValoresVagasCliente() {
        VagaDiaria vaga = new VagaDiaria();
        vaga.setQuantidadeDias(2);
        VagaSemanal vaga1 = new VagaSemanal();
        vaga1.setQuantidadeSemanas(3);
        VagaMensal vaga2 = new VagaMensal();
        vaga2.setQuantidadeMeses(4);

        Cliente cliente = new Cliente();
        cliente.alocarVaga(vaga);
        cliente.alocarVaga(vaga1);
        cliente.alocarVaga(vaga2);

        ArrayList<Float> esperado = new ArrayList<Float>();
        esperado.add(20f);
        esperado.add(120f);
        esperado.add(600f);

        assertEquals(esperado, cliente.listaValorVagas());
    }

}