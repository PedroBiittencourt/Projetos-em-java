package lista3.exercicio1;

public class Retangulo extends FormaGeometrica {

    private float base;
    private float altura;

    public Retangulo(){
        this.base = 0;
        this.altura = 0;
    }

    public float getBase() {
        return this.base;
    }

    public void setBase(float base) {
        if (base <= 0){
            throw new IllegalArgumentException("Base invalida");
        }
        this.base = base;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        if (altura <= 0){
            throw new IllegalArgumentException("Altura invalida");
        }
        this.altura = altura;
    }

    public float calcularArea(){
        if (this.base == 0){
            throw new IllegalArgumentException("Base invalida");
        }
        if (this.altura == 0){
            throw new IllegalArgumentException("Altura invalida");
        }
        return this.base * this.altura;
    }

    public float calcularPerimetro(){
        if (this.base == 0){
            throw new IllegalArgumentException("Base invalida");
        }
        if (this.altura == 0){
            throw new IllegalArgumentException("Altura invalida");
        }
        return 2 * (this.base + this.altura);
    }

}
