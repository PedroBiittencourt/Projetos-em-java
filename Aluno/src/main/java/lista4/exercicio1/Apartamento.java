package lista4.exercicio1;

public class Apartamento extends Imovel{

    private int quantidadeAndar;

    public int getQuantidadeAndar() {
        return this.quantidadeAndar;
    }

    public void setQuantidadeAndar(int quantidadeAndar) {
        this.quantidadeAndar = quantidadeAndar;
    }

    public float calcularValor() {
        if (quantidadeAndar >= 10) {
            return 0;
        }
        else {
            return (getQuantidadeMetroQuadrado() * getPrecoMetroQuadrado()) - ((getQuantidadeMetroQuadrado() * getPrecoMetroQuadrado()) * ((this.quantidadeAndar-1) * 0.1f));
        }
    }
}
