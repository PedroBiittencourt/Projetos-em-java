package lista4.exercicio5;

public class ManutencaoCPU extends Manutencao {

    public ManutencaoCPU(){
        super();
    }

    public float calcularValor() {
        return (getValorPecasTrocadas() + getValorMaoDeObra());
    }

    public String getTipoManutencao(){
        return "Manutenção de CPU";
    }

}
