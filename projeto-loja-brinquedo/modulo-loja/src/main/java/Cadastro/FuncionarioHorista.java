package Cadastro;

public class FuncionarioHorista extends Funcionario {


    private static final String cod = "02";
    private Integer horasTrabalhadas ;

    public FuncionarioHorista(String nomeFuncionario, Integer horasTrabalhadas) {
        super(nomeFuncionario);
        getCod();
        getSalario();
        this.horasTrabalhadas = horasTrabalhadas;
        setSalarioFinal(getSalario());

    }

    public static String getCod() {
        return cod;
    }


    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void setSalarioFinal(Double salarioFinal) {
        super.setSalarioFinal(getSalario() + (getHorasTrabalhadas() *2));
    }

    @Override
    public String toString() {
        return "FuncionarioHorista{" +
                "Nome" + getNomeFuncionario()+
                " Cod "+ getCod() +
                " SalarioBase "+ getSalario() +
                " Horas " + getHorasTrabalhadas() +
                " SalarioFinal " + getSalarioFinal() +
                '}';
    }
}
