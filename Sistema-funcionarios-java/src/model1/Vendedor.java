package model1;

public class Vendedor extends Funcionario {

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

    public double calcularSalario() {
        return (getSalarioBase() + getComission());
    }
}
