package lista4.exercicio4;

public class FreteNormal extends Frete {

    public FreteNormal() {
        super();
    }

    public float calcularFrete() {
        return getValorFrete();
    }

    public String getTipoFrete(){
        return "Frete normal";
    }

}
