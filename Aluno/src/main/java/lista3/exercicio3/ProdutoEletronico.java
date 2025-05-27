package lista3.exercicio3;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(float preco, String nome){
        super(preco, nome);
    }

    public float calcularPreco(){
        return getPrecoBase() * 0.9f;
    }

}
