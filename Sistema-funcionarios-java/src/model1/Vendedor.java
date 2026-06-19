package model1;

public class Vendedor extends Funcionario {

    public Vendedor() {
        setEstrategia(new CalculoComComissao());
    }

    @Override
    public String exibirDetalhes() {
        return "comissão " + getAdicional();
    }
}