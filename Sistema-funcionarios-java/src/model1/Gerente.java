package model1;

public class Gerente extends Funcionario {

    public Gerente() {
        setEstrategia(new CalculoComBonus());
    }

    @Override
    public String exibirDetalhes() {
        return "Bonus " + getAdicional();
    }
}