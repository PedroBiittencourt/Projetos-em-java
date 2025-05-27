package lista3.exercicio5;

public class ProdutoEletronico extends Produto {


    public ProdutoEletronico(float precoUnitario, String nome, float estoque, float quantidade){
        super(precoUnitario, nome, estoque, quantidade);
    }

    public float calcularPreco(){
        return getPrecoUnitario() * getQuantidade();
    }

}
