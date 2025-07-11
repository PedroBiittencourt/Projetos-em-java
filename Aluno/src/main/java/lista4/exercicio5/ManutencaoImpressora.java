package lista4.exercicio5;

public class ManutencaoImpressora extends Manutencao {

    public ManutencaoImpressora(){
        super();
    }

    public float calcularValor() {
        return (getValorPecasTrocadas() + getValorMaoDeObra());
    }
}
