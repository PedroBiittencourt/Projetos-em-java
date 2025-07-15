package lista4.exercicio8;

public class AlunoMensalista extends Aluno {

    public AlunoMensalista(Curso curso) {
        super(curso);
    }

    public String getTipoAluno(){
        return "Mensalista";
    }

    public String getDadosAluno(){
        return "Aluno: " + getNome() + ". Matricula: " + getMatricula() + ". Endereco: " + getEndereco() +
                ". Tipo: " + getTipoAluno() + ". Valor mensalidade: R$" + getValorMensalidade() +
                ". Quantidade parcelas: " + getQuantidadeParcelas() + ".";
    }

}
