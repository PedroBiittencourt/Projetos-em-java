package lista3.exercicio4;

public class VooInternacional extends Voo{

    private float taxaConversao;
    private float fatorPrecoInternacional;

    public VooInternacional(String origem, String destino, float distancia, String data){
        super(origem, destino, distancia, data);
        this.fatorPrecoInternacional = 0;
        this.taxaConversao = 0;
    }

    public float getTaxaConversao() {
        return this.taxaConversao;
    }

    public void setTaxaConversao(float taxaConversao) {
        if (taxaConversao <= 0){
            throw new IllegalArgumentException("Taxa de conversao invalida");
        }
        this.taxaConversao = taxaConversao;
    }

    public float getFatorPrecoInternacional() {
        return this.fatorPrecoInternacional;
    }

    public void setFatorPrecoInternacional(float fatorPrecoInternacional) {
        if (fatorPrecoInternacional <= 0){
            throw new IllegalArgumentException("Fator de preco invalido");
        }
        this.fatorPrecoInternacional = fatorPrecoInternacional;
    }

    public float calcularPreco(){
        if (this.fatorPrecoInternacional == 0){
            throw new IllegalArgumentException("Fator preco invalido");
        }
        if (this.taxaConversao == 0){
            throw new IllegalArgumentException("Taxa de conversao invalida");
        }
        return getDistancia() * this.fatorPrecoInternacional * this.taxaConversao;
    }

}
