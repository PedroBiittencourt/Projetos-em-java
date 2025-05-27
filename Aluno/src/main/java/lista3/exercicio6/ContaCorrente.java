package lista3.exercicio6;

public class ContaCorrente extends ContaBancaria{

    private float taxaManutencao;

    public ContaCorrente(String titular,int numeroConta, float saldo){
        super(titular, numeroConta, saldo);
        this.taxaManutencao = 0;
    }

    public float getTaxaManutencao() {
        return this.taxaManutencao;
    }

    public void setTaxaManutencao(float taxaManutencao) {
        if (taxaManutencao <= 0){
            throw new IllegalArgumentException("Taxa de manutencao invalida");
        }
        this.taxaManutencao = taxaManutencao;
    }

    public void depositar(float quantia){
        if (quantia <= 0){
            throw new IllegalArgumentException("Quantia invalida");
        }
        if (taxaManutencao == 0){
            throw new IllegalArgumentException("Taxa de manutencao invalida");
        }
        setSaldo((getSaldo()+quantia)*(1-(this.taxaManutencao/100)));
    }
    
    public void sacar(float quantia){
        if (quantia <= 0 || quantia > getSaldo()){
            throw new IllegalArgumentException("Quantia invalida");
        }
        setSaldo(getSaldo()-quantia);
    }

    public void calcularJuros(){}

}
