package model1;

public class Gerente extends Funcionario {

    public String exibirDetalhes() {
        return "Bonus " + bonus;
    }

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double calcularSalario() {
    return (getSalarioBase() + getBonus());

}
}



