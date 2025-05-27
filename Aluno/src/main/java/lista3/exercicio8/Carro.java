package lista3.exercicio8;

public class Carro extends Veiculo{

    private float fatorFixoCarro;

    public Carro(String marca, String modelo, float precoBase){
        super(marca, modelo, precoBase);
    }

    public float getFatorFixoCarro() {
        return this.fatorFixoCarro;
    }

    public void setFatorFixoCarro(float fatorFixoCarro) {
        if (fatorFixoCarro <= 0){
            throw new IllegalArgumentException("Fator fixo invalido");
        }
        this.fatorFixoCarro = fatorFixoCarro;
    }

    public float calcularCusto(){
        if (this.fatorFixoCarro == 0){
            throw new IllegalArgumentException("Fator fixo invalido");
        }
        return getPrecoBase() * this.fatorFixoCarro;
    }

}
