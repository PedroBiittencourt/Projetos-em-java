package lp4.calculoFrete;

public class Entrega {

    private Float distancia;
    private Encomenda encomenda;

    public Entrega(Float distancia, Encomenda encomenda) {
        setDistancia(distancia);
        setEncomenda(encomenda);
    }

    public Float getDistancia() {
        return this.distancia;
    }

    public void setDistancia(Float distancia) {
        if (distancia <= 0){
            throw new IllegalArgumentException("Distancia invalida");
        }
        this.distancia = distancia;
    }

    public Encomenda getEncomenda() {
        return this.encomenda;
    }

    public void setEncomenda(Encomenda encomenda) {
        if (encomenda == null){
            throw new IllegalArgumentException("Encomenda invalida");
        }
        this.encomenda = encomenda;
    }

    public Float calculoFrete(){
        Float valorBase;
        if(this.distancia <= 10){
            valorBase = 8f;
        } else {
            if(this.distancia <= 30){
                valorBase = 12f;
            } else {
                if (this.distancia <= 60){
                    valorBase = 18f;
                } else{
                    if(this.distancia <= 100){
                        valorBase = 25f;
                    } else{
                        if(this.distancia <= 200){
                            valorBase = 40f;
                        } else{
                            valorBase = 40f + (0.3f*(this.distancia-200f));
                        }
                    }
                }
            }
        }
        Float acrescimoPeso = 0f;
        if(this.encomenda.getPeso() > 2){
            acrescimoPeso = 4f;
        } else {
            if(this.encomenda.getPeso() > 5){
                acrescimoPeso = 8f;
            } else {
                if(this.encomenda.getPeso() > 10){
                    acrescimoPeso = 15f;
                } else{
                    if(this.encomenda.getPeso() > 20){
                        acrescimoPeso = 25f;
                    } else{
                        if(this.encomenda.getPeso() > 30){
                            acrescimoPeso = 25f + (2f*(25f-this.encomenda.getPeso()));
                        }
                    }
                }
            }
        }
        return valorBase+acrescimoPeso;
    }

}
