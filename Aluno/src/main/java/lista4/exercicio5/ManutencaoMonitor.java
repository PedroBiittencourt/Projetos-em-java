package lista4.exercicio5;

public class ManutencaoMonitor extends Manutencao {

    public ManutencaoMonitor(){
        super();
    }

    public float calcularValor() {
        return getValorMaoDeObra();
    }

    public String getTipoManutencao(){
        return "Manutenção de Monitor";
    }

}
