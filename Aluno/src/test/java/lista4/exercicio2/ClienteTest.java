package lista4.exercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

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
    void deveAlocarConta(){
        Cliente cliente1 = new Cliente();
        Conta conta1 = new ContaCorrenteNormal();
        cliente1.alocar(conta1);
        assertEquals(1, cliente1.getNumeroContas());
    }

    @Test
    void deveRetornarListaSaldos(){
        ContaCorrenteNormal conta1 = new ContaCorrenteNormal();
        ContaCorrenteEspecial conta2 = new ContaCorrenteEspecial();
        ContaPoupanca conta3 = new ContaPoupanca();

        conta1.setSaldoDisponivel(100f);
        conta2.setSaldoDisponivel(100f);
        conta2.setLimiteCredito(1);
        conta3.setSaldoDisponivel(99f);

        Cliente cliente = new Cliente();
        cliente.alocar(conta1);
        cliente.alocar(conta2);
        cliente.alocar(conta3);

        ArrayList<Float> resultadoEsperado = new ArrayList<Float>();
        resultadoEsperado.add(conta1.calcularSaldo());
        resultadoEsperado.add(conta2.calcularSaldo());
        resultadoEsperado.add(conta3.calcularSaldo());

        assertEquals(resultadoEsperado, cliente.listaSaldos());

    }

    @Test
    void deveRetornarListaContas(){
        ContaCorrenteNormal conta1 = new ContaCorrenteNormal();
        ContaCorrenteEspecial conta2 = new ContaCorrenteEspecial();
        ContaPoupanca conta3 = new ContaPoupanca();

        Cliente cliente = new Cliente();
        cliente.alocar(conta1);
        cliente.alocar(conta2);
        cliente.alocar(conta3);

        ArrayList<String> resultadoEsperado = new ArrayList<String>();
        resultadoEsperado.add("Normal");
        resultadoEsperado.add("Especial");
        resultadoEsperado.add("Poupança");

        assertEquals(resultadoEsperado, cliente.listaContas());

    }

}