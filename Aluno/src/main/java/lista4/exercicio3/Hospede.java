package lista4.exercicio3;

import java.util.ArrayList;

public class Hospede {

    private String nome;
    private int codigo;
    private ArrayList<Reserva> reservas;

    public Hospede(){
        this.codigo = 0;
        this.reservas = new ArrayList<Reserva>();
    }

    public ArrayList<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
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

    public void alocarReserva(Reserva reserva){
        if (!this.reservas.contains(reserva)){
            this.reservas.add(reserva);
        }
    }

    public int getNumeroReservas(){
        return this.reservas.size();
    }

    public ArrayList<String> listaReservas() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Reserva reserva : this.reservas){
            resultado.add(reserva.getTipoReserva());
        }
        return resultado;
    }

    public ArrayList<Float> listaPrecoReservas(){
        ArrayList<Float> resultado = new ArrayList<>();
        for (Reserva reserva : this.reservas){
            resultado.add(reserva.calcularPreco());
        }
        return resultado;
    }

}
