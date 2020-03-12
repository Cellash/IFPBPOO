package Cadastro;

public class FuncionarioCLT extends Funcionario {

    private static final String cod = "01";
    private Double desconto = 0.1;



    public FuncionarioCLT(String nomeFuncionario) {
        super(nomeFuncionario);
        getCod();
        getSalario();
        getDesconto();
        setSalarioFinal(getSalario());

    }

    public static String getCod() {
        return cod;
    }

    public Double getDesconto() {
        return desconto;
    }


    @Override
    public void setSalarioFinal(Double salarioFinal) {
        super.setSalarioFinal(salarioFinal - (salarioFinal*getDesconto()));
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{"+
                "Nome" + getNomeFuncionario()+
                " Cod "+ getCod() +
                " SalarioBase "+ getSalario() +
                " Desconto " + getDesconto() +
                " SalarioFinal " + getSalarioFinal() +
                '}';
    }
}
