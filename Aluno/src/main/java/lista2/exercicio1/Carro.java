package lista2.exercicio1;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade_atual;
    private String estado;

    public Carro() {
        this.estado = "Desligado";
        this.velocidade_atual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getVelocidade_atual() {
        return velocidade_atual;
    }

    public void setVelocidade_atual(float velocidade_atual) {
        if (velocidade_atual < 0){
            throw new IllegalArgumentException("Velocidade atual invalida");
        }
        this.velocidade_atual = velocidade_atual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float acelerar(float velocidade){
        return this.velocidade_atual + velocidade;
    }

    public void frear(float velocidade){
        this.velocidade_atual = this.velocidade_atual - velocidade;
        if (this.velocidade_atual < 0){
            this.velocidade_atual = 0;
        }
    }

    public void ligar(){
        this.estado = "Ligado";
    }

    public void desligar(){
        this.estado = "Desligado";
        this.velocidade_atual = 0;
    }


}
