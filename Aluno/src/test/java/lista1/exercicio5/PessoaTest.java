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
        pessoa.setAltura(2f);
        pessoa.setPeso(40f);
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
    public void deveVerificarCondicaoImcMasculinoNoPesoNormalValorLimte1() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(20.7f);
        pessoa.setGenero("Masculino");
        assertEquals("No peso normal", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcMasculinoNoPesoNormalValorLimite2() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(26.3f);
        pessoa.setGenero("Masculino");
        assertEquals("No peso normal", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcMasculinoMarginalmenteAcimaDoPesoValorLimte1() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(26.4f);
        pessoa.setGenero("Masculino");
        assertEquals("Marginalmente acima do peso", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcMasculinoMarginalmenteAcimaDoPesoValorLimte2() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.7f);
        pessoa.setGenero("Masculino");
        assertEquals("Marginalmente acima do peso", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcMasculinoAcimaDoPesoIdealValorLimte1() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.8f);
        pessoa.setGenero("Masculino");
        assertEquals("Acima do peso ideal", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcMasculinoAcimaDoPesoIdealValorLimte2() {
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
    public void deveVerificarCondicaoImcFemininoPesoNormalValorLimte1() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(19.1f);
        pessoa.setGenero("Feminino");
        assertEquals("No peso normal", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcFemininoPesoNormalValorLimte2() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.7f);
        pessoa.setGenero("Feminino");
        assertEquals("No peso normal", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcFemininoMarginalmenteAcimaDoPesoValorLimte1() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(25.8f);
        pessoa.setGenero("Feminino");
        assertEquals("Marginalmente acima do peso", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcFemininoMarginalmenteAcimaDoPesoValorLimte2() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.2f);
        pessoa.setGenero("Feminino");
        assertEquals("Marginalmente acima do peso", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcFemininoAcimaDoPesoIdealValorLimte1() {
        pessoa.setAltura(1.0f);
        pessoa.setPeso(27.3f);
        pessoa.setGenero("Feminino");
        assertEquals("Acima do peso ideal", pessoa.verificarCondicao(pessoa.calcularImc()));
    }

    @Test
    public void deveVerificarCondicaoImcFemininoAcimaDoPesoIdealValorLimte2() {
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

    @Test
    void deveVerificarSexoIndeterminado(){
        pessoa.setAltura(1.0f);
        pessoa.setPeso(32.2f);
        pessoa.setGenero("Macho");
        assertEquals("Sexo indeterminado.", pessoa.verificarCondicao(pessoa.calcularImc()));
    }


}