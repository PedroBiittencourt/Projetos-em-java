package exercicioRelampagoSurpresaNumeroPi;

public class Cidade {
    private Estado estado;
    private String nome;

    public Cidade(Estado estado) {
        this.setEstado(estado);
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Estado invalido");
        }
        this.estado = estado;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("Cidade invalida");
        }
        this.nome = nome;
    }

    public String getNomeEstado() {
        return this.estado.getNome();
    }
}
