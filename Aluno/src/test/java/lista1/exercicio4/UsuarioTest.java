package lista1.exercicio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {
    Usuario usuario;

    @BeforeEach
    void setUp(){
        usuario = new Usuario();
    }

    @Test
    void deveCalcularMediaDeCombustivelGasto(){
        usuario.setQuilometrosRodados(1);
        usuario.setCombustivelConsumido(2);
        assertEquals(2.0f, usuario.calcularMediaDeCombustivelGasto());
    }

}