package lista2.exercicio6;

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    private String departamento;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void receber_aumento(float percentual) {
        this.salario = this.salario * (1 + (percentual/100));
    }

    public void mudar_departamento(String novo_departamento) {
        this.departamento = novo_departamento;
    }

    public void exibir_dados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Salario: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
    }

}
