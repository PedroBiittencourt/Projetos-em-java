package lista4.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoMensalistaTest {

    @Test
    void deveRetornarTipoAluno(){
        AlunoMensalista aluno = new AlunoMensalista(new Curso());
        assertEquals("Mensalista", aluno.getTipoAluno());
    }

    @Test
    void deveRetornarDadosAluno(){
        AlunoMensalista aluno1 = new AlunoMensalista(new Curso());
        aluno1.setNome("Guilherme");
        aluno1.setMatricula(123);
        aluno1.setEndereco("Rua A");
        aluno1.setValorMensalidade(100);
        aluno1.setQuantidadeParcelas(10);
        assertEquals("Aluno: Guilherme. Matricula: 123. Endereco: Rua A" +
                ". Tipo: Mensalista. Valor mensalidade: R$100.0" +
                ". Quantidade parcelas: 10.", aluno1.getDadosAluno());
    }

}