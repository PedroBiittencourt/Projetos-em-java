package lista1.exercicio4;

public class Usuario {
    private float quilometrosRodados;
    private float combustivelConsumido;

    public float getQuilometrosRodados() {
        return quilometrosRodados;
    }

    public void setQuilometrosRodados(float quilometrosRodados) {
        this.quilometrosRodados = quilometrosRodados;
    }

    public float getCombustivelConsumido() {
        return combustivelConsumido;
    }

    public void setCombustivelConsumido(float combustivelConsumido) {
        this.combustivelConsumido = combustivelConsumido;
    }

    public float calcularMediaDeCombustivelGasto(){
        return this.combustivelConsumido / this.quilometrosRodados;
    }

}
