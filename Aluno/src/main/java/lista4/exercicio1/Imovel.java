package lista4.exercicio1;

public abstract class Imovel {
    private float precoMetroQuadrado;
    private float quantidadeMetroQuadrado;

    public float getPrecoMetroQuadrado() {
        return this.precoMetroQuadrado;
    }

    public void setPrecoMetroQuadrado(float precoMetroQuadrado) {
        if (precoMetroQuadrado <= 0){
            throw new IllegalArgumentException("Preco por metro quadradado invalido");
        }
        this.precoMetroQuadrado = precoMetroQuadrado;
    }

    public float getQuantidadeMetroQuadrado() {
        return this.quantidadeMetroQuadrado;
    }

    public void setQuantidadeMetroQuadrado(float quantidadeMetroQuadrado) {
        if (quantidadeMetroQuadrado <= 0){
            throw new IllegalArgumentException("Quantidade de metro quadradado invalido");
        }
        this.quantidadeMetroQuadrado = quantidadeMetroQuadrado;
    }

    public abstract float calcularValor();

}
