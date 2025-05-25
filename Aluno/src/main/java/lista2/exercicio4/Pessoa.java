package lista2.exercicio4;

public class Pessoa {
    private String nome;
    private float idade;
    private float altura;
    private float peso;

    public Pessoa() {
        this.peso = 0;
        this.idade = 0;
        this.altura = 0;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getIdade() {
        return this.idade;
    }

    public void setIdade(float idade) {
        if (idade < 0){
            throw new IllegalArgumentException("Idade invalida");
        }
        this.idade = idade;
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

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("Peso invalido");
        }
        this.peso = peso;
    }

    public void envelhecer() {
        this.idade = this.idade + 1;
    }

    public void crescer(float centimetros){
        if (centimetros <= 0){
            throw new IllegalArgumentException("Centimetros invalidos");
        }
        if (idade < 21) {
            this.altura = centimetros + this.altura;
        }
    }

    public void ganhar_Peso(float quilos) {
        if (quilos <= 0){
            throw new IllegalArgumentException("Quilos invalidos");
        }
        this.peso = this.peso + quilos;
    }

    public void perder_Peso(float quilos) {
        if (quilos <= 0 || quilos >= this.peso){
            throw new IllegalArgumentException("Quilos invalidos");
        }
        this.peso = this.peso - quilos;
    }

}
