package lista4.exercicio8;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String descricao;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso() {
        this.codigo = 0;
        this.cargaHoraria = 0;
        this.alunos = new ArrayList<Aluno>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("Codigo invalido");
        }
        this.codigo = codigo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.trim().isEmpty()){
            throw new IllegalArgumentException("Descricao invalida");
        }
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria <= 0) {
            throw new IllegalArgumentException("Carga horaria invalida");
        }
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void alocarAluno(Aluno aluno) {
        if (!this.alunos.contains(aluno)){
            this.alunos.add(aluno);
        }
    }

    public int getQuantidadeAlunos() {
        return this.alunos.size();
    }

    public ArrayList<String> listaAlunos() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Aluno aluno : alunos) {
            resultado.add(aluno.getDadosAluno());
        }
        return resultado;
    }

    public ArrayList<String> listaAlunosCurso(int codigo) {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Aluno aluno : alunos) {
            if (aluno.getCodigoCurso() == codigo) {
                resultado.add(aluno.getDadosAluno());
            }
        }
        return resultado;
    }
}
