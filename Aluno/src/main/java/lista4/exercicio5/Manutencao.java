package lista4.exercicio5;

public abstract class Manutencao {
    private int numeroManutencao;
    private float valorMaoDeObra;


    public int getNumeroManutencao() {
        return this.numeroManutencao;
    }

    public void setNumeroManutencao(int numeroManutencao) {
        this.numeroManutencao = numeroManutencao;
    }

    public float getValorMaoDeObra() {
        return this.valorMaoDeObra;
    }

    public void setValorMaoDeObra(float valorMaoDeObra) {
        this.valorMaoDeObra = valorMaoDeObra;
    }

    public abstract float calcularValorManutencao();


}
