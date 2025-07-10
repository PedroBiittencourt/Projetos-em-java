package lista4.exercicio5;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Manutencao> manutencoes;

    public Cliente() {
        this.codigo = 0;
        this.nome = "";
        this.manutencoes = new ArrayList<Manutencao>();
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
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

    public ArrayList<String> listaManutencaoCliente() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Manutencao manutencao : manutencoes) {
            if (manutencao.getClass().equals(ManutencaoCPU.class)) {
                resultado.add("Manutenção de CPU");
            } else if (manutencao.getClass().equals(ManutencaoMonitor.class)) {
                resultado.add("Manutençãoo de Monitor");
            } else if (manutencao.getClass().equals(ManutencaoImpressora.class)) {
                resultado.add("Manutençãoo de Impressora");
            }
        }
        return resultado;
    }

    public ArrayList<Float> listaValoresManutencaoCliente() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Manutencao manutencao : manutencoes) {
            resultado.add(manutencao.calcularValorManutencao());
        }
        return resultado;
    }
}
