package br.edu.ifpb;

public class Diretor extends Empregado {
    private String bonus;

    public Diretor() {
        this.bonus = "Departamento";
    }

    public Diretor(String nome, int idade, double salario, String bonus) {
        super(nome, idade, salario);
        this.bonus = bonus;
    }

    public Diretor(String nome, int idade, String bonus) {
        super(nome, idade);
        this.bonus = bonus;
    }
}
