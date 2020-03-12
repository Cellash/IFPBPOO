package Cadastro;

public abstract class Funcionario {

    private String nomeFuncionario;
    private static final Double salario = 700.00;
    private Double salarioFinal;

    public Funcionario(String nomeFuncionario) {
        this.setNomeFuncionario(nomeFuncionario);

    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(Double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nomeFuncionario='" + getNomeFuncionario() + '\'' +
                ", salario=" + getSalario() +
                '}';
    }
}
