package lista1.exercicio5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    public void deveCalcularImc() {
        pessoa.setAltura(2);
        pessoa.setPeso(40);
        assertEquals(10, pessoa.calcularImc());
    }

    @Test
    public void deveVerificarCondicaoImcMasculinoAbaixoDoPeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(20.6f);
        pessoa.setGenero("Masculino");
        assertEquals("Abaixo do peso", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcMasculinoNoPesoNormal() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(26.3f);
        pessoa.setGenero("Masculino");
        assertEquals("No peso normal", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcMasculinoMarginalmenteAcimaDoPeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.7f);
        pessoa.setGenero("Masculino");
        assertEquals("Marginalmente acima do peso", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcMasculinoAcimaDoPesoIdeal() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.0f);
        pessoa.setGenero("Masculino");
        assertEquals("Acima do peso ideal", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcMasculinoObeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(31.1f);
        pessoa.setGenero("Masculino");
        assertEquals("Obeso", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcFemininoAbaixoDoPeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(19.0f);
        pessoa.setGenero("Feminino");
        assertEquals("Abaixo do peso", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcFemininoNoPesoNormal() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.7f);
        pessoa.setGenero("Feminino");
        assertEquals("No peso normal", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcFemininoMarginalmenteAcimaDoPeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.2f);
        pessoa.setGenero("Feminino");
        assertEquals("Marginalmente acima do peso", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcFemininoAcimaDoPesoIdeal() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.2f);
        pessoa.setGenero("Feminino");
        assertEquals("Acima do peso ideal", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcFemininoObeso() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.3f);
        pessoa.setGenero("Feminino");
        assertEquals("Obeso", pessoa.verificarCondicao(pessoa.calcularImc()));
    }


}