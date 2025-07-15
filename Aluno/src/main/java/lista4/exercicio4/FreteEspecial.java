package lista4.exercicio4;

public class FreteEspecial extends Frete{

    public FreteEspecial() {
        super();
    }

    public float calcularFrete() {
        return (getValorFrete() + getTaxaEntrega());
    }

    public String getTipoFrete(){
        return "Frete especial";
    }

}
