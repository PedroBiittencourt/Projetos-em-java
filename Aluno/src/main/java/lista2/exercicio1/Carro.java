package lista2.exercicio1;

import java.time.LocalDate;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade_atual;
    private boolean ligado;

    public Carro() {
        this.ligado = false;
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
        if (ano < 1886) {
            throw new IllegalArgumentException("Ano invalido!");
        }
        LocalDate dataAtual = LocalDate.now();
        int anoAtual = dataAtual.getYear();
        if (ano > anoAtual) {
            throw new IllegalArgumentException("Ano invalido!");
        }
        this.ano = ano;
    }

    public int getVelocidade_atual() {
        return velocidade_atual;
    }

    public void setVelocidade_atual(int velocidade_atual) {
        if (velocidade_atual < 0){
            throw new IllegalArgumentException("Velocidade atual invalida");
        }
        this.velocidade_atual = velocidade_atual;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int acelerar(int velocidade){
        if (! this.ligado) {
            throw new IllegalArgumentException("Nao pode acelerar com carro desligado");
        }
        if (velocidade < 0) {
            throw new IllegalArgumentException("Velocidade invalida");
        }
        return this.velocidade_atual + velocidade;
    }

    public void frear(int velocidade){
        if (velocidade > this.velocidade_atual || velocidade < 0) {
            throw new IllegalArgumentException("Velocidade invalida");
        }
        if (! this.ligado) {
            throw new IllegalArgumentException("Nao pode frear com carro desligado");
        }
        this.velocidade_atual = this.velocidade_atual - velocidade;
    }

    public void ligar(){
        if (this.ligado) {
            throw new IllegalArgumentException("O carro ja esta ligado");
        }
        this.ligado = true;
    }

    public void desligar(){
        if (! this.ligado) {
            throw new IllegalArgumentException("O carro ja esta desligado");
        }
        this.ligado= false;
        this.velocidade_atual = 0;
    }


}
