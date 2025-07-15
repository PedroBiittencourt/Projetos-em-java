package lista4.exercicio5;

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
    void deveAlocarUmaManutencao() {
        ManutencaoCPU manutencao1 = new ManutencaoCPU();
        Cliente cliente = new Cliente();
        cliente.alocarManutencao(manutencao1);
        assertEquals(1, cliente.numeroManutencoes());
    }

    @Test
    void deveNaoAlocarContaRepetida(){
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao1 = new ManutencaoCPU();
        cliente.alocarManutencao(manutencao1);
        cliente.alocarManutencao(manutencao1);
        assertEquals(1,cliente.numeroManutencoes());
    }

    @Test
    void deveAlocarZeroManutencoes() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.numeroManutencoes());
    }

    @Test
    void deveAlocarMaisDeUmaManutencao(){
        Cliente cliente = new Cliente();
        ManutencaoCPU manutencao1 = new ManutencaoCPU();
        ManutencaoCPU manutencao2 = new ManutencaoCPU();
        cliente.alocarManutencao(manutencao1);
        cliente.alocarManutencao(manutencao2);
        assertEquals(2, cliente.numeroManutencoes());
    }

    @Test
    void deveRetornarListaValorManutencaoCLiente() {
        ManutencaoCPU manutencao = new ManutencaoCPU();
        manutencao.setValorPecasTrocadas(10);
        manutencao.setValorMaoDeObra(5);
        ManutencaoImpressora manutencao2 = new ManutencaoImpressora();
        manutencao2.setValorPecasTrocadas(16);
        manutencao2.setValorMaoDeObra(4);
        ManutencaoMonitor manutencao3 = new ManutencaoMonitor();
        manutencao3.setValorMaoDeObra(40);


        Cliente cliente = new Cliente();
        cliente.alocarManutencao(manutencao);
        cliente.alocarManutencao(manutencao2);
        cliente.alocarManutencao(manutencao3);

        ArrayList<Float> esperado = new ArrayList<Float>();
        esperado.add(15f);
        esperado.add(20f);
        esperado.add(40f);
        assertEquals(esperado, cliente.listaValoresManutencao());
    }

    @Test
    void deveRetornarListaManutencaoCLiente() {
        ManutencaoCPU manutencao = new ManutencaoCPU();
        ManutencaoImpressora manutencao2 = new ManutencaoImpressora();
        ManutencaoMonitor manutencao3 = new ManutencaoMonitor();


        Cliente cliente = new Cliente();
        cliente.alocarManutencao(manutencao);
        cliente.alocarManutencao(manutencao2);
        cliente.alocarManutencao(manutencao3);

        ArrayList<String> esperado = new ArrayList<String>();
        esperado.add("Manutenção de CPU");
        esperado.add("Manutenção de Impressora");
        esperado.add("Manutenção de Monitor");
        assertEquals(esperado, cliente.listaManutencao());
    }

}