package lista3.exercicio5;

public class ProdutoRoupa extends Produto {

    private float desconto;

    public ProdutoRoupa(float precoEtiqueta, String nome, float estoque,  float quantidade){
        super(precoEtiqueta, nome, estoque, quantidade);
    }


    public float getDesconto() {
        return this.desconto;
    }

    public void setDesconto(float desconto) {
        if (desconto <= 0){
            throw new IllegalArgumentException("Desconto invalido");
        }
        this.desconto = desconto;
    }

    public float calcularPreco(){
        if (getQuantidade() >= 3){
            return getPrecoUnitario() * getQuantidade() * (1-(this.desconto/100));
        }
        return getPrecoUnitario() * getQuantidade();
    }

}
