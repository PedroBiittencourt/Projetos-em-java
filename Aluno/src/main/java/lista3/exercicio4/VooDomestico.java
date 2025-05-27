package lista3.exercicio4;

public class VooDomestico extends Voo{

    private float fatorPrecoDomestico;

    public VooDomestico(String origem, String destino, float distancia, String data){
        super(origem, destino, distancia, data);
        this.fatorPrecoDomestico = 0;
    }

    public float getFatorPrecoDomestico() {
        return this.fatorPrecoDomestico;
    }

    public void setFatorPrecoDomestico(float fatorPrecoDomestico) {
        if (fatorPrecoDomestico <= 0){
            throw new IllegalArgumentException("Fator de preco invalido");
        }
        this.fatorPrecoDomestico = fatorPrecoDomestico;
    }

    public float calcularPreco(){
        if (this.fatorPrecoDomestico == 0){
            throw new IllegalArgumentException("Fator preco invalido");
        }
        return getDistancia() * this.fatorPrecoDomestico;
    }

}
