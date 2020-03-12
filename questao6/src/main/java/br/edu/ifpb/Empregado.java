package br.edu.ifpb;

public class Empregado {
    private String nome;
    private int idade;
    private double salario;

    public Empregado() {
        this.nome = "nome";
        this.idade = 0;
        this.salario = 0;
    }

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Empregado(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
