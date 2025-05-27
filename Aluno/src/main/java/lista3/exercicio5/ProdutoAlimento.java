package lista3.exercicio5;

public class ProdutoAlimento extends Produto{

    public ProdutoAlimento(float precoQuilo, String nome, float estoque,  float quantidade){
        super(precoQuilo, nome, estoque, quantidade);
    }

    public float calcularPreco(){
        return getPrecoUnitario() * getQuantidade();
    }

}
