package lista3.exercicio3;

public abstract class Produto {
    private String nome;
    private float precoBase;

    public Produto(float preco, String nome){
        this.precoBase = 0;
        setPrecoBase(preco);
        setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().equals("")){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
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

    public abstract float calcularPreco();

}
