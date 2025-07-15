package lista4.exercicio1;

public class Lote extends Imovel{

    public Lote(){
        super();
    }

    public float calcularValor(){
        return getQuantidadeMetroQuadrado() * getPrecoMetroQuadrado();
    }

    public String getTipoImovel(){
        return "Lote";
    }

}
