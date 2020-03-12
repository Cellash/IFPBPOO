package Cadastro;

public class Main {

    public static void main(String[] args) {

        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Caio-Horista", 19);
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("ANA-CLT");
        FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado("Maria-Comissionada ", 1300.00);


        System.out.println(funcionarioCLT);
        System.out.println(funcionarioHorista);
        System.out.println(funcionarioComissionado);

        Loja loja = new Loja();
        loja.adicionaFuncionario(funcionarioCLT);
        loja.adicionaFuncionario(funcionarioComissionado);
        loja.adicionaFuncionario(funcionarioHorista);



    }
}
