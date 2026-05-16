import model1.Funcionario;
import model1.Gerente;
import model1.Vendedor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("===========Menu========");
            System.out.println("1 Adicionar vendedor");
            System.out.println("2 Adicionar gerente");
            System.out.println("3 Listar funcionarios");
            System.out.println("4 Sair");
            System.out.println("=======================");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    Vendedor vendedor = new Vendedor();
                    System.out.println("vendedor selecionado");
                    System.out.println("Digite o Nome:");
                    vendedor.setName(sc.nextLine());
                    System.out.println("Digite um login");
                    vendedor.setLogin(sc.nextLine());
                    System.out.println("Digite uma senha");
                    vendedor.setPassword(sc.nextLine());
                    System.out.println("Digite um salário");
                    vendedor.setSalarioBase(sc.nextDouble());
                    System.out.println("Digite a Comissão");
                    vendedor.setComission(sc.nextDouble());
                    lista.add(vendedor);
                }
                case 2 -> {
                    Gerente gerente = new Gerente();
                    System.out.println("model1.Gerente selecionado");
                    System.out.println("Digite o Nome:");
                    gerente.setName(sc.nextLine());
                    System.out.println("Digite um login");
                    gerente.setLogin(sc.nextLine());
                    System.out.println("Digite uma senha");
                    gerente.setPassword(sc.nextLine());
                    System.out.println("Digite um salário");
                    gerente.setSalarioBase(sc.nextDouble());
                    System.out.println("Digite a Bonificação:");
                    gerente.setBonus(sc.nextDouble());
                    lista.add(gerente);
                }
                case 3 -> {
                    for (Funcionario f : lista) {
                        System.out.println("-------");
                        System.out.println(f.getClass().getSimpleName());
                        System.out.println("nome: " + f.getName());
                        System.out.println("login: " + f.getLogin());
                        System.out.println("senha: " + f.getPassword());
                        System.out.println("salario base: " + f.getSalarioBase());
                        System.out.println("Adicional: " + f.exibirDetalhes());
                        System.out.println("total: " + f.calcularSalario());


                    }
                }
                case 4 -> {
                    System.out.println("Saindo....");
                    return;
                   }

                }
            }
        }
    }




