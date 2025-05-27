package lista3.exercicio4;

public abstract class Voo {
    private String origem;
    private float distancia;
    private String destino;
    private String data;

    public Voo(String origem, String destino, float distancia, String data){
        this.distancia = 0;
        setData(data);
        setDestino(destino);
        setOrigem(origem);
        setDistancia(distancia);
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        if (origem.trim().equals("")){
            throw new IllegalArgumentException("Origem invalida");
        }
        this.origem = origem;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public void setDistancia(float distancia) {
        if (distancia <= 0){
            throw new IllegalArgumentException("Distancia invalida");
        }
        this.distancia = distancia;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        if (destino.trim().equals("")){
            throw new IllegalArgumentException("Destino invalido");
        }
        this.destino = destino;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        if (data.trim().equals("")){
            throw new IllegalArgumentException("Data invalida");
        }
        this.data = data;
    }

    public abstract float calcularPreco();


}
