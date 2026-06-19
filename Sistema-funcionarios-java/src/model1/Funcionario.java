package model1;

public abstract class Funcionario {

    private String name;
    private String login;
    private String password;
    private double salarioBase;
    private double adicional;
    private CalculoSalarioStrategy estrategia;

    public abstract String exibirDetalhes();

    public double calcularSalario() {
        return estrategia.calcular(salarioBase, adicional);
    }

    public void setEstrategia(CalculoSalarioStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}