package lista3.exercicio3;

public class ProdutoRoupa extends Produto{

    public ProdutoRoupa(float preco, String nome){
        super(preco, nome);
    }

    public float calcularPreco(){
        return getPrecoBase() * 0.8f;
    }

}
