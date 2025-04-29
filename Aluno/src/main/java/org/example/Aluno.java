package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Aluno {
    private float nota1;
    private float nota2;

    public Aluno (){
        this.nota1 = 0;
        this.nota2 = 0;
    }

    public void setNota1 (float nota1) {
        this.nota1 = nota1;
    }
    public float getNota1  () {
        return this.nota1;
    }

    public void setNota2 (float nota2) {
        this.nota2 = nota2;
    }

    public float getNota2 (){
        return this.nota2;
    }

    public float somarNotas (){
        return (this.nota1 + this.nota2);
    }

    public float calcularMedia (){
        return (this.somarNotas()/2);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        System.out.println(aluno.somarNotas());
        aluno.setNota1(5);
        aluno.setNota2(7);
        System.out.println(aluno.somarNotas());
        Aluno aluno2 = new Aluno();
        aluno2.setNota1(5);
        aluno2.setNota2(8);
        System.out.println(aluno2.somarNotas());
    }
    }
