package lista4.exercicio6;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Vaga> vagas;

    public Cliente() {
        this.codigo = 0;
        this.vagas = new ArrayList<Vaga>();
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

    public ArrayList<Vaga> getVagas() {
        return this.vagas;
    }

    public void setVagas(ArrayList<Vaga> vagas) {
        this.vagas = vagas;
    }

    public void alocarVaga(Vaga vaga) {
        if (!this.vagas.contains(vaga)){
            this.vagas.add(vaga);
        }
    }

    public int getNumeroVagas() {
        return this.vagas.size();
    }

    public ArrayList<String> listaVagas() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Vaga vaga : vagas) {
            if (vaga.getClass().equals(VagaDiaria.class)) {
                resultado.add("Vaga diária");
            } else if (vaga.getClass().equals(VagaSemanal.class)) {
                resultado.add("Vaga semanal");
            } else if (vaga.getClass().equals(VagaMensal.class)) {
                resultado.add("Vaga mensal");
            }
        }
        return resultado;
    }

    public ArrayList<Float> listaValorVagas() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Vaga vaga : vagas) {
            resultado.add(vaga.calcularAluguel());
        }
        return resultado;
    }
}
