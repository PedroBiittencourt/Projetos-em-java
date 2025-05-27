package lista3.exercicio1;

public class Circulo extends FormaGeometrica {

    public static final float pi = 3.14f;
    private float raio;

    public Circulo(){
        this.raio = 0;
    }

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        if (raio <= 0){
            throw new IllegalArgumentException("Raio invalido");
        }
        this.raio = raio;
    }

    public float calcularArea(){
        if (this.raio == 0){
            throw new IllegalArgumentException("Raio invalido");
        }
        return pi * (this.raio*this.raio);
    }

    public float calcularPerimetro(){
        if (this.raio == 0){
            throw new IllegalArgumentException("Raio invalido");
        }
        return 2 * pi * this.raio;
    }

}
