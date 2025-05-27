package lista3.exercicio5;

public abstract class Produto {
    private String nome;
    private float precoUnitario;
    private float estoque;
    private float quantidade;

    public Produto(float preco, String nome, float estoque, float quantidade){
        this.precoUnitario = 0;
        this.estoque = 0;
        this.quantidade =  0;
        setPrecoUnitario(preco);
        setNome(nome);
        setEstoque(estoque);
        setQuantidade(quantidade);
        this.estoque = getEstoque() - getQuantidade();
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

    public float getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario <= 0){
            throw new IllegalArgumentException("Preco invalido");
        }
        this.precoUnitario = precoUnitario;
    }

    public float getEstoque() {
        return this.estoque;
    }

    public void setEstoque(float estoque) {
        if (estoque <= 0){
            throw new IllegalArgumentException("Estoque invalido");
        }
        this.estoque = estoque;
    }

    public float getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(float quantidade) {
        if (quantidade <= 0 || quantidade > getEstoque()){
            throw new IllegalArgumentException("Quantidade invalida");
        }
        this.quantidade = quantidade;
    }

    public abstract float calcularPreco();

}
