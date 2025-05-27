package lista3.exercicio8;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private float precoBase;

    public Veiculo(String marca, String modelo, float precoBase){
        this.precoBase = 0;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca.trim().equals("")){
            throw new IllegalArgumentException("Marca invalida");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        if (modelo.trim().equals("")){
            throw new IllegalArgumentException("Modelo invalido");
        }
        this.modelo = modelo;
    }

    public float getPrecoBase() {
        return this.precoBase;
    }

    public void setPrecoBase(float precoBase) {
        if (precoBase <= 0){
            throw new IllegalArgumentException("Preco invalido");
        }
        this.precoBase = precoBase;
    }

    public abstract float calcularCusto();
}
