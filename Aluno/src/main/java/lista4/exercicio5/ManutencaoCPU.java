package lista4.exercicio5;

public class ManutencaoCPU extends Manutencao {
    private float valorPecasTrocadas;

    public float getValorPecasTrocadas() {
        return this.valorPecasTrocadas;
    }

    public void setValorPecasTrocadas(float valorPecasTrocadas) {
        this.valorPecasTrocadas = valorPecasTrocadas;
    }

    public float calcularValorManutencao() {
        return (this.valorPecasTrocadas + getValorMaoDeObra());
    }
}
