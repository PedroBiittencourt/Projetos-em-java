package lista1.exercicio2;

public class Funcionario {
    private float salarioBruto;
    private float valorHorasExtras;
    private float inss;

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public float getValorHorasExtras() {
        return valorHorasExtras;
    }

    public void setValorHorasExtras(float valorHorasExtras) {
        if (valorHorasExtras < 0){
            throw new IllegalArgumentException("Valor de horas extras invalido");
        }
        this.valorHorasExtras = valorHorasExtras;
    }

    public float getInss() {
        return inss;
    }

    public void setInss(float inss) {
        if (inss < 0){
        throw new IllegalArgumentException("Valor de INSS invalido");
        }
        this.inss = inss;
    }

    public void setSalarioBruto(float salarioBruto) {
        if (salarioBruto <= 0){
            throw new IllegalArgumentException("Valor de salario bruto invalido");
        }
        this.salarioBruto = salarioBruto;
    }

    public float calcularSalarioLiquido() {
        return (this.salarioBruto+this.valorHorasExtras) - ((this.salarioBruto+this.valorHorasExtras)*(this.inss/100));
    }

}
