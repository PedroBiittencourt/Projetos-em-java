package lista4.exercicio1;

public class Apartamento extends Imovel{

    private int quantidadeAndar;

    public Apartamento(){
        super();
        this.quantidadeAndar = 0;
    }

    public int getQuantidadeAndar() {
        return this.quantidadeAndar;
    }

    public void setQuantidadeAndar(int quantidadeAndar) {
        if (quantidadeAndar <= 0){
            throw new IllegalArgumentException("Quantidade de andar invalido");
        }
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

    public String getTipoImovel(){
        return "Apartamento";
    }

}
