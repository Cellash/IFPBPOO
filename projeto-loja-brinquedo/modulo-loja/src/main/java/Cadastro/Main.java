package Cadastro;

public class Main {

    public static void main(String[] args) {

        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Tulio", 19);
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Erickson");
        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Erickson ", 1300.00);


        System.out.println(funcionarioCLT);
        System.out.println(funcionarioHorista);
        System.out.println(funcionarioComissionado);

        Loja loja = new Loja();
        loja.adicionaFuncionario(funcionarioCLT);


    }
}
