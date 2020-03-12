package Cadastro;

public class FuncionarioComissionado extends Funcionario {
    private static final String cod = "03";
    private Double comissao;


    public FuncionarioComissionado(String nomeFuncionario, Double comissao) {
        super(nomeFuncionario);
        this.comissao = comissao;
        setSalarioFinal(getSalario());
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    public static String getCod() {
        return cod;
    }

    @Override
    public void setSalarioFinal(Double salarioFinal) {
        super.setSalarioFinal(salarioFinal + getComissao());
    }

    @Override
    public String toString() {
        return "FuncionariaComissionada{" +
                "Nome" + getNomeFuncionario()+
                " Cod "+ getCod() +
                " SalarioBase "+ getSalario() +
                " Comissao " + getComissao() +
                " SalarioFinal " + getSalarioFinal() +

                '}';
    }
}
