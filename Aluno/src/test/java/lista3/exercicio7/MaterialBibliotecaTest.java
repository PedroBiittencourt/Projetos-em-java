package lista3.exercicio7;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class MaterialBibliotecaTest {

    @Test
    void deveVerificarTituloInvalido(){
        try{
            Calendar calendar = Calendar.getInstance();
            calendar.set(2023, Calendar.MAY, 25); // Data: 25 de Maio de 2025
            Date dataPublicacao = calendar.getTime();
            MaterialBiblioteca material= new Livro("", dataPublicacao, 15);
        }
        catch (IllegalArgumentException e){
            assertEquals("Titulo invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarPrazoInvalido(){
        try{
            Calendar calendar = Calendar.getInstance();
            calendar.set(2023, Calendar.MAY, 25); // Data: 25 de Maio de 2025
            Date dataPublicacao = calendar.getTime();
            MaterialBiblioteca material= new Livro("Diario de um banana", dataPublicacao, 0);
        }
        catch (IllegalArgumentException e){
            assertEquals("Prazo invalido", e.getMessage());
        }
    }

}