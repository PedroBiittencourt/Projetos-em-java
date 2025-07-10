package lista4.exercicio1;

import java.sql.Array;
import java.util.ArrayList;

public class Contribuinte {
    private String nome;
    private int codigo;
    private ArrayList<Imovel> imoveis;

    public Contribuinte() {
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
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void alocar(Imovel imovel){
        if (!this.imoveis.contains(imovel)) {
            this.imoveis.add(imovel);
        }
    }

    public int getNumeroImoveis() {
        return this.imoveis.size();
    }

    public void desalocar(Imovel imovel) {
        this.imoveis.remove(imovel);
    }

    public ArrayList<Float> obterValorImoveis() {
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Imovel imovel : this.imoveis){
            resultado.add(imovel.calcularValor());
        }
        return resultado;
    }



}
