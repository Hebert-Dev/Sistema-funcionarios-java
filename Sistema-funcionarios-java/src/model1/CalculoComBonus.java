package model1;

public class CalculoComBonus implements CalculoSalarioStrategy {

    @Override
    public double calcular(double salarioBase, double adicional) {
        return salarioBase + adicional;
    }
}