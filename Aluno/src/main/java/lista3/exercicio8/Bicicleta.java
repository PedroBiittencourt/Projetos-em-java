package lista3.exercicio8;

public class Bicicleta extends Veiculo{
    private float fatorFixoBicicleta;

    public Bicicleta(String marca, String modelo, float precoBase){
        super(marca, modelo, precoBase);
    }

    public float getFatorFixoBicicleta() {
        return this.fatorFixoBicicleta;
    }

    public void setFatorFixoBicicleta(float fatorFixoBicicleta) {
        if (fatorFixoBicicleta <= 0){
            throw new IllegalArgumentException("Fator fixo invalido");
        }
        this.fatorFixoBicicleta = fatorFixoBicicleta;
    }

    public float calcularCusto(){
        if (this.fatorFixoBicicleta == 0){
            throw new IllegalArgumentException("Fator fixo invalido");
        }
        return getPrecoBase() * this.fatorFixoBicicleta;
    }
}
