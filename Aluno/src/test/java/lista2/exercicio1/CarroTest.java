package lista2.exercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {
    Carro carro;

    @BeforeEach
    void setUp(){
        carro = new Carro();
    }

    @Test
    void deveVerificarAnoMenorQue1886() {
        try{
            carro.setAno(1885);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Ano invalido!");
        }
    }

    @Test
    void deveVerificarAnoMaiorQueAtual() {
        try{
            carro.setAno(100000000);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Ano invalido!");
        }
    }

    @Test
    void deveAcelerar(){
        carro.ligar();
        assertEquals(30, carro.acelerar(30));
    }

    @Test
    void deveNaoAcelerarCarroDesligado(){
        try{
            carro.acelerar(1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Nao pode acelerar com carro desligado");
        }
    }

    @Test
    void deveVerificarVelocidadeNegativaAoAcelerar(){
        try{
            carro.ligar();
            carro.acelerar(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Velocidade invalida");
        }
    }

    @Test
    void deveVerificarVelocidadeAtualNegativa(){
        try{
            carro.setVelocidade_atual(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Velocidade atual invalida");
        }
    }

    @Test
    void deveFrear(){
        carro.setVelocidade_atual(10);
        carro.frear(9);
        assertEquals(1, carro.getVelocidade_atual());
    }

    @Test
    void deveVerificarVelocidadeMaiorQueVelocidadeAtualAoFrear(){
        try{
            carro.ligar();
            carro.frear(1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Velocidade invalida");
        }
    }

    @Test
    void deveVerificarVelocidadeNegativaAoFrear(){
        try{
            carro.ligar();
            carro.frear(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Velocidade invalida");
        }
    }

    @Test
    void deveNaoFrearCarroDesligado(){
        try{
            carro.frear(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Nao pode frear com carro desligado");
        }
    }

    @Test
    void deveLigar(){
        carro.setLigado(false);
        carro.ligar();
        assertEquals(true, carro.getLigado());
    }

    @Test
    void deveNaoLigarCarroQueJaEstaLigado(){
        try{
            carro.ligar();
            carro.ligar();
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "O carro ja esta ligado");
        }
    }

    @Test
    void deveDesligar(){
        carro.setLigado(true);
        carro.desligar();
        assertEquals(false, carro.getLigado());
    }

    @Test
    void deveNaoDesligarCarroQueJaEstaDesligado(){
        try{
            carro.desligar();
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "O carro ja esta desligado");
        }
    }

    @Test
    void deveVerificarVelocidadeCarroDesligado(){
        carro.ligar();
        carro.setVelocidade_atual(10);
        carro.desligar();
        assertEquals(0, carro.getVelocidade_atual());
    }

}