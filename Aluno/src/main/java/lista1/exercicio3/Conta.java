package lista1.exercicio3;

public class Conta {
    private float quilowatts;
    private float valorIcms;

    public float getQuilowatts() {
        return quilowatts;
    }

    public void setQuilowatts(float quilowatts) {
        this.quilowatts = quilowatts;
    }

    public float getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(float valorIcms) {
        this.valorIcms = valorIcms;
    }

    public float calcularValorASerPagoEnergiaEletrica(){
        return (this.quilowatts*0.12f)+((this.valorIcms/100)*(this.quilowatts*0.12f));
    }

}
