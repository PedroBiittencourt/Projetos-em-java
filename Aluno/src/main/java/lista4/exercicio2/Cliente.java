package lista4.exercicio2;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private int codigo;
    private ArrayList<Conta> contas;

    public Cliente(){
        this.contas = new ArrayList<Conta>();
    }

    public ArrayList<Conta> getContas() {
        return this.contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
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
        if (codigo <= 0) {
            throw new IllegalArgumentException("Codigo invalido");
        }
        this.codigo = codigo;
    }

    public void alocar(Conta conta){
        if (!this.contas.contains(conta)){
            this.contas.add(conta);
        }
    }

    public void desalocar(Conta conta) {
        this.contas.remove(conta);
    }

    public int getNumeroContas(){
        return this.contas.size();
    }

    public ArrayList<Float> listaSaldos(){
        ArrayList<Float> resultado = new ArrayList<Float>();
        for (Conta conta: this.contas){
            resultado.add(conta.calcularSaldo());
        }
        return resultado;
    }

    public ArrayList<String> listaContas() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Conta conta : this.contas) {
            if (conta.getClass().equals(ContaCorrenteNormal.class)) {
                resultado.add("Normal");
            } else if (conta.getClass().equals(ContaCorrenteEspecial.class)) {
                resultado.add("Especial");
            } else if (conta.getClass().equals(ContaPoupanca.class)) {
                resultado.add("Poupança");
            }
        }
        return resultado;
    }

}
