package lp4.calculoFrete;

public class Encomenda {

    private Float peso;

    public Encomenda(Float peso) {
        setPeso(peso);
    }

    public Float getPeso() {
        return this.peso;
    }

    public void setPeso(Float peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("Peso invalido");
        }
        this.peso = peso;
    }
}
