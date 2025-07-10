package lista4.exercicio6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveRetornarZeroVagas() {
        Cliente cliente = new Cliente();
        assertEquals(0, cliente.calcularNumeroVagas());
    }

    @Test
    void deveRetornarUmaVaga() {
        Vaga vaga = new VagaDiaria();
        Cliente cliente = new Cliente();
        cliente.alocarVaga(vaga);
        assertEquals(1, cliente.calcularNumeroVagas());
    }

    @Test
    void deveRetornarMaisDeUmaVaga() {
        Vaga vaga1 = new VagaDiaria();
        Vaga vaga2 = new VagaDiaria();
        Cliente cliente = new Cliente();
        cliente.alocarVaga(vaga1);
        cliente.alocarVaga(vaga2);
        assertEquals(2, cliente.calcularNumeroVagas());
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

        assertEquals(esperado, cliente.listaVagasCliente());
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

        assertEquals(esperado, cliente.listaValorVagasCliente());
    }

}