package lista3.exercicio7;

import java.util.Date;
import java.util.Calendar;

public class Livro extends MaterialBiblioteca{

    public Livro(String titulo, Date dataPublicacao, int prazo){
        super(titulo,dataPublicacao,prazo);
    }

    public Date calcularDataDevolucao(Date dataEmprestimo){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataEmprestimo);
        calendar.add(Calendar.DAY_OF_MONTH, getPrazo());
        return calendar.getTime();
    }

}
