package lista4.exercicio7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarZeroFitas() {
        lista4.exercicio6.Cliente cliente = new lista4.exercicio6.Cliente();
        assertEquals(0, cliente.calcularNumeroVagas());
    }

    @Test
    void deveRetornarUmaFita() {
        Fita fita = new FitaEspecial();
        Cliente cliente = new Cliente();
        cliente.alocarFita(fita);
        assertEquals(1, cliente.calcularQuantiadeFitasAlugadas());
    }

    @Test
    void deveRetornarMaisDeUmaFita() {
        Fita fita1 = new FitaEspecial();
        Fita fita2 = new FitaEspecial();
        Cliente cliente = new Cliente();
        cliente.alocarFita(fita1);
        cliente.alocarFita(fita2);
        assertEquals(2, cliente.calcularQuantiadeFitasAlugadas());
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

        assertEquals(esperado, cliente.listaFitasAlugadas());
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

        assertEquals(esperado, cliente.listaValoresFitasAlugadas());
    }

}