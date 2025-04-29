package lista2.exercicio5;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade_estoque;
    private String categoria;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("Preco invalido");
        }
        this.preco = preco;
    }

    public int getQuantidade_estoque() {
        return this.quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        if (quantidade_estoque < 0) {
            throw new IllegalArgumentException("Quantidade de estoque invalido");
        }
        this.quantidade_estoque = quantidade_estoque;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void adicionar_estoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        }
        this.quantidade_estoque += quantidade;
    }

    public void remover_estoque(int quantidade) {
        if (quantidade < 0 || quantidade > this.quantidade_estoque) {
            throw new IllegalArgumentException("Quantidade invalida");
        }
        this.quantidade_estoque -= quantidade;
    }

    public void aplicar_desconto(float percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual invalido");
        }
        this.preco = this.preco - (this.preco * (percentual / 100));
    }

}
