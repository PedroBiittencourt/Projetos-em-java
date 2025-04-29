package lista2.exercicio6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario();
    }

    @Test
    void deveReceberAumento() {
        funcionario.setSalario(1);
        funcionario.receber_aumento(10);
        assertEquals(1.1f, funcionario.getSalario());
    }

    @Test
    void deveMudarDepartamento() {
        funcionario.setDepartamento("Administrativo");
        funcionario.mudar_departamento("Financeiro");
        assertEquals("Financeiro", funcionario.getDepartamento());
    }

    @Test
    void deveExibirDados() {
        funcionario.setDepartamento("Administrativo");
        funcionario.setNome("Pedrao gostosao");
        funcionario.setCargo("CEO");
        funcionario.setSalario(100000.00f);
    }


}