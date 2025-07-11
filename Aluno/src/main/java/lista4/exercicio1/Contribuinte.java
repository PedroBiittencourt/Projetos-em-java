package lista4.exercicio1;

import java.sql.Array;
import java.util.ArrayList;

public class Contribuinte {
    private String nome;
    private int codigo;
    private ArrayList<Imovel> imoveis;

    public Contribuinte() {
        this.codigo = 0;
        this.imoveis = new ArrayList<Imovel>();
    }

    public ArrayList<Imovel> getImoveis() {
        return this.imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
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

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0){
            throw new IllegalArgumentException("Codigo invalido");
        }
        this.codigo = codigo;
    }

    public void alocarImovel(Imovel imovel){
        if (!this.imoveis.contains(imovel)) {
            this.imoveis.add(imovel);
        }
    }

    public int getNumeroImoveis() {
        return this.imoveis.size();
    }

    public ArrayList<Float> getValorImoveis() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Imovel imovel : this.imoveis){
            resultado.add(imovel.calcularValor());
        }
        return resultado;
    }

    public ArrayList<String> getImoveisPorCliente() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Imovel imovel : this.imoveis) {
            if (imovel.getClass() == Lote.class) {
                resultado.add("Lote");
            } else if (imovel.getClass() == Casa.class) {
                resultado.add("Casa");
            } else if (imovel.getClass() == Apartamento.class) {
                resultado.add("Apartamento");
            }
        }
        return resultado;
    }

}
