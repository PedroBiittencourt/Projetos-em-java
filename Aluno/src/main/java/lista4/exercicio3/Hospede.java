package lista4.exercicio3;

import java.util.ArrayList;

public class Hospede {

    private String nome;
    private int codigo;
    private ArrayList<Reserva> reservas;

    public Hospede(){
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
        this.nome = nome;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void alocar(Reserva reserva){
        if (!this.reservas.contains(reserva)){
            this.reservas.add(reserva);
        }
    }

    public void desalocar(Reserva reserva){
        this.reservas.remove(reserva);
    }

    public int getNumeroReservas(){
        return this.reservas.size();
    }

    public ArrayList<String> listaReservas() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Reserva reserva : this.reservas){
            if(reserva.getClass().equals(QuartoSingle.class)){
                resultado.add("Quarto single");
            }
            else if(reserva.getClass().equals(QuartoDuplo.class)){
                resultado.add("Quarto duplo");
            } else if(reserva.getClass().equals(QuartoTriplo.class)){
                resultado.add("Quarto triplo");
            }
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
