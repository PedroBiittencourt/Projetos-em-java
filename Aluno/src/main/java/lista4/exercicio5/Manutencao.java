package lista4.exercicio5;

public abstract class Manutencao {
    private int numeroManutencao;
    private float valorMaoDeObra;
    private float valorPecasTrocadas;

    public Manutencao(){
        this.numeroManutencao = 0;
        this.valorPecasTrocadas = 0;
        this.valorMaoDeObra = 0;
    }

    public float getValorPecasTrocadas() {
        return this.valorPecasTrocadas;
    }

    public void setValorPecasTrocadas(float valorPecasTrocadas) {
        if (valorPecasTrocadas <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.valorPecasTrocadas = valorPecasTrocadas;
    }

    public int getNumeroManutencao() {
        return this.numeroManutencao;
    }

    public void setNumeroManutencao(int numeroManutencao) {
        if (numeroManutencao <= 0) {
            throw new IllegalArgumentException("Numero invalido");
        }
        this.numeroManutencao = numeroManutencao;
    }

    public float getValorMaoDeObra() {
        return this.valorMaoDeObra;
    }

    public void setValorMaoDeObra(float valorMaoDeObra) {
        if (valorMaoDeObra <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        this.valorMaoDeObra = valorMaoDeObra;
    }

    public abstract float calcularValor();


}
