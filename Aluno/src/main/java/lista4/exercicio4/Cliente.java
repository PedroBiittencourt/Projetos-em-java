package lista4.exercicio4;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Frete> fretes;

    public Cliente() {
        this.codigo = 0;
        this.fretes = new ArrayList<Frete>();
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

    public ArrayList<Frete> getFretes() {
        return this.fretes;
    }

    public void setFretes(ArrayList<Frete> fretes) {
        this.fretes = fretes;
    }

    public void alocarFrete(Frete frete) {
        if (!this.fretes.contains(frete)){
            this.fretes.add(frete);
        }
    }

    public int getQuantidadeFretes() {
        return this.fretes.size();
    }

    public ArrayList<String> retornarFretesCliente() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Frete frete : fretes) {
            resultado.add(frete.getTipoFrete());
        }
        return resultado;
    }

    public ArrayList<Float> retornarValoresFrete() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Frete frete : fretes) {
            resultado.add(frete.calcularFrete());
        }
        return resultado;
    }
}
