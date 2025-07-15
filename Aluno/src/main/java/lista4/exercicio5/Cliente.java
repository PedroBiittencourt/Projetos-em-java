package lista4.exercicio5;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Manutencao> manutencoes;

    public Cliente() {
        this.codigo = 0;
        this.manutencoes = new ArrayList<Manutencao>();
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

    public ArrayList<Manutencao> getManutencoes() {
        return this.manutencoes;
    }

    public void setManutencoes(ArrayList<Manutencao> manutencoes) {
        this.manutencoes = manutencoes;
    }

    public void alocarManutencao(Manutencao manutencao) {
        if (!this.manutencoes.contains(manutencao)){
            this.manutencoes.add(manutencao);
        }
    }

    public int numeroManutencoes() {
        return (this.manutencoes.size());
    }

    public ArrayList<String> listaManutencao() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Manutencao manutencao : manutencoes) {
            resultado.add(manutencao.getTipoManutencao());
        }
        return resultado;
    }

    public ArrayList<Float> listaValoresManutencao() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Manutencao manutencao : manutencoes) {
            resultado.add(manutencao.calcularValor());
        }
        return resultado;
    }
}
