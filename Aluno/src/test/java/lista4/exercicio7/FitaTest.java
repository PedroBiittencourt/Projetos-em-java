package lista4.exercicio7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaTest {

    @Test
    void deveVerificarQuantidadeDiasEmprestimoZeradoNegativo(){
        try {
            Fita fita = new FitaCatalogo();
            fita.setQuantidadeDiasEmprestimo(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade de dias invalida", e.getMessage());
        }
    }

    @Test
    void deveVerificarQuantidadeDiasEmprestimoValido(){
            Fita fita = new FitaCatalogo();
            fita.setQuantidadeDiasEmprestimo(1);
            assertEquals(1, fita.getQuantidadeDiasEmprestimo());
    }

    @Test
    void deveVerificarValorAluguelDiarioZeradoNegativo(){
        try {
            Fita fita = new FitaCatalogo();
            fita.setValorAluguelDiario(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarValorAluguelDiarioValido(){
            Fita fita = new FitaCatalogo();
            fita.setValorAluguelDiario(0.01f);
            assertEquals(0.01f, fita.getValorAluguelDiario(), 0.001f);
    }

    @Test
    void deveVerificarNomeFilmeInvalido(){
        try {
            Fita fita = new FitaCatalogo();
            fita.setNomeFilme(" ");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome de filme invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNomeFilmeValido(){
            Fita fita = new FitaCatalogo();
            fita.setNomeFilme("As branquelas");
            assertEquals("As branquelas", fita.getNomeFilme());
    }

}