package lista4.exercicio7;

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
    void deveAlocarFita() {
        Fita fita = new FitaEspecial();
        Cliente cliente = new Cliente();
        cliente.alocarFita(fita);
        assertEquals(1, cliente.getQuantidadeFitas());
    }

    @Test
    void deveNaoAlocarFitaRepetida(){
        Cliente cliente = new Cliente();
        Fita fita = new FitaEspecial();
        cliente.alocarFita(fita);
        cliente.alocarFita(fita);
        assertEquals(1,cliente.getQuantidadeFitas());
    }

    @Test
    void deveRetornarQuantidadeFitas() {
        Fita fita1 = new FitaEspecial();
        Fita fita2 = new FitaEspecial();
        Cliente cliente = new Cliente();
        cliente.alocarFita(fita1);
        cliente.alocarFita(fita2);
        assertEquals(2, cliente.getQuantidadeFitas());
    }

    @Test
    void deveRetornarListaFitas() {
        FitaEspecial fita1 = new FitaEspecial();
        FitaCatalogo fita2 = new FitaCatalogo();
        FitaLancamento fita3 = new FitaLancamento();

        Cliente cliente = new Cliente();
        cliente.alocarFita(fita1);
        cliente.alocarFita(fita2);
        cliente.alocarFita(fita3);

        ArrayList<String> esperado = new ArrayList<String>();
        esperado.add("Fita Especial");
        esperado.add("Fita Catalogo");
        esperado.add("Fita Lancamento");

        assertEquals(esperado, cliente.listaFitas());
    }

    @Test
    void deveRetornarListaValoresFitas() {
        FitaEspecial fita1 = new FitaEspecial();
        FitaCatalogo fita2 = new FitaCatalogo();
        FitaLancamento fita3 = new FitaLancamento();

        fita1.setQuantidadeDiasEmprestimo(1);
        fita1.setValorAluguelDiario(10);
        fita2.setQuantidadeDiasEmprestimo(1);
        fita3.setQuantidadeDiasEmprestimo(1);
        fita3.setValorAluguelDiario(8);

        Cliente cliente = new Cliente();
        cliente.alocarFita(fita1);
        cliente.alocarFita(fita2);
        cliente.alocarFita(fita3);

        ArrayList<Float> esperado = new ArrayList<Float>();
        esperado.add(10f);
        esperado.add(5f);
        esperado.add(8f);

        assertEquals(esperado, cliente.listaValoresFitas());
    }

}