package lista4.exercicio1;

public class Lote extends Imovel{

    public float calcularValor(){
        return getQuantidadeMetroQuadrado() * getPrecoMetroQuadrado();
    }

}
