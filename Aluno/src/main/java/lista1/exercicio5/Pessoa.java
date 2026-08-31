package lista1.exercicio5;

public class Pessoa {
    private Float peso;
    private Float altura;
    private String genero;

    public float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float calcularImc() {
        return this.peso / (this.altura*this.altura);
    }



    public String verificarCondicao(float imc) {
        if (this.genero == "Masculino") {
            if (imc < 20.7f) {
                return "Abaixo do peso";
            } else {
                if (imc >= 20.7f && imc < 26.4f) {
                    return "No peso normal";
                }
                if (imc >= 26.4f && imc < 27.8f) {
                    return "Marginalmente acima do peso";
                }
                if (imc >= 27.8f && imc < 31.1f) {
                    return "Acima do peso ideal";
                }
                if (imc >= 31.1f) {
                    return "Obeso";
                }
            }
        } if (this.genero == "Feminino"){
                if (imc < 19.1f) {
                    return "Abaixo do peso";
                } else {
                    if (imc >= 19.1f && imc < 25.8f) {
                        return "No peso normal";
                    }
                    if (imc >= 25.8f && imc < 27.3f) {
                        return "Marginalmente acima do peso";
                    }
                    if (imc >= 27.3f && imc < 32.3f) {
                        return "Acima do peso ideal";
                    }
                    if (imc >= 32.3f) {
                        return "Obeso";
                    }
                }

        }
        return "Sexo indeterminado.";
    }
}
