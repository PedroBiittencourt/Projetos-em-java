package lista3.exercicio3;

public  class ProdutoLivro extends Produto{

    public ProdutoLivro(float preco, String nome){
        super(preco, nome);
    }

    public float calcularPreco(){
        return getPrecoBase() * 0.95f;
    }

}
