package model1;

public class Vendedor extends Funcionario {
@Override
    public String exibirDetalhes() {
        return "comission " + comission;
    }

    private double comission;

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }
@Override
    public double calcularSalario() {
        return (getSalarioBase() + getComission());
    }
}
