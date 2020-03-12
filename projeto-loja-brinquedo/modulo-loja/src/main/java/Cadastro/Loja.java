package Cadastro;

import java.util.ArrayList;

public class Loja {

    public static void main(String[] args) {

        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Tulio", 19);
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Erickson");
        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Erickson ", 1300.00);


        System.out.println(funcionarioCLT);
        System.out.println(funcionarioHorista);
        System.out.println(funcionarioComissionado);

        Loja loja = new Loja();
        loja.adicionaFuncionario(funcionarioCLT);
        loja.verificaFuncionario(0);

    }

    ArrayList<Funcionario> loja = new ArrayList<>();

    public void adicionaFuncionario(Funcionario funcionario){
         loja.add(funcionario);
    }
    public void verificaFuncionario(int numero){
        loja.get(numero);
    }
}
