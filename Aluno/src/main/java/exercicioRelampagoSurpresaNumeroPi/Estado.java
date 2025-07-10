package exercicioRelampagoSurpresaNumeroPi;

public class Estado {
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("Estado invalido");
        }
        this.nome = nome;
    }
}
