package lista4.exercicio7;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Fita> fitas;

    public Cliente() {
        this.codigo = 0;
        this.fitas = new ArrayList<Fita>();
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

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public ArrayList<Fita> getFitas() {
        return this.fitas;
    }

    public void setFitas(ArrayList<Fita> fitas) {
        this.fitas = fitas;
    }

    public void alocarFita(Fita fita) {
        if (!this.fitas.contains(fita)){
            this.fitas.add(fita);
        }
    }

    public int getQuantidadeFitas() {
        return this.fitas.size();
    }

    public ArrayList<String> listaFitas() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Fita fita : fitas) {
            resultado.add(fita.getTipoFita());
        }
        return resultado;
    }

    public ArrayList<Float> listaValoresFitas() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Fita fita : fitas) {
            resultado.add(fita.calcularValorEmprestimo());
        }
        return resultado;
    }
}
