package lista4.exercicio1;

public class Casa extends Imovel{

    public Casa(){
        super();
    }

    public float calcularValor(){
        return (getQuantidadeMetroQuadrado() * getPrecoMetroQuadrado()) + (getQuantidadeMetroQuadrado() * 50);
    }

}
