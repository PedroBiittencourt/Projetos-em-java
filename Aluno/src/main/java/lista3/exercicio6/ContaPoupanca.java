package lista3.exercicio6;

public class ContaPoupanca extends ContaBancaria{

    private float taxaJuros;

    public ContaPoupanca(String titular,int numeroConta, float saldo){
        super(titular, numeroConta, saldo);
        this.taxaJuros = 0;
    }

    public float getTaxaJuros() {
        return this.taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        if (taxaJuros <= 0){
            throw new IllegalArgumentException("Taxa de juros invalida");
        }
        this.taxaJuros = taxaJuros;
    }

    public void depositar(float quantia){
        if (quantia <= 0){
            throw new IllegalArgumentException("Quantia invalida");
        }
        setSaldo(getSaldo()+quantia);
    }

    public void sacar(float quantia){
        if (quantia <= 0 || quantia > getSaldo()){
            throw new IllegalArgumentException("Quantia invalida");
        }
        setSaldo(getSaldo()-quantia);
    }

    public void calcularJuros(){
        if (getSaldo() == 0){
            throw new IllegalArgumentException("Nao e possivel aplicar juros para essa quantia de saldo");
        }
        if (this.taxaJuros == 0){
            throw new IllegalArgumentException("Taxa de juros invalida");
        }
        setSaldo(getSaldo()*(1-(this.taxaJuros/100)));
    }

}
