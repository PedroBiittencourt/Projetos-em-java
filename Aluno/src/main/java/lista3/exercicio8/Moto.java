package lista3.exercicio8;

public class Moto extends Veiculo{
    private float fatorFixoMoto;

    public Moto(String marca, String modelo, float precoBase){
        super(marca, modelo, precoBase);
    }

    public float getFatorFixoMoto() {
        return this.fatorFixoMoto;
    }

    public void setFatorFixoMoto(float fatorFixoMoto) {
        if (fatorFixoMoto <= 0){
            throw new IllegalArgumentException("Fator fixo invalido");
        }
        this.fatorFixoMoto = fatorFixoMoto;
    }

    public float calcularCusto(){
        if (this.fatorFixoMoto == 0){
            throw new IllegalArgumentException("Fator fixo invalido");
        }
        return getPrecoBase() * this.fatorFixoMoto;
    }
}
