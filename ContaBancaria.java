import java.util.Scanner;

public class ContaBancaria {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name = "Alberto Aleixo Patyk";
    double saldo = 1000;
    int op;

    // Dados do cliente
    System.out.println("***************************");
    System.out.println("Dados Iniciais do Cliente");
    System.out.println("Nome: " + name);
    System.out.println("Tipo de Conta: Corrente");
    System.out.printf("Saldo: R$ %.2f\n", saldo);
    System.out.println("***************************");

    // Loop para operações
    do {
      System.out.println("\nEscolha a Operação que Deseja: ");
      System.out.println("1 - Depositar");
      System.out.println("2 - Sacar");
      System.out.println("3 - Consultar Saldo");
      System.out.println("4 - Sair");
      System.out.print("Opção: ");
      op = sc.nextInt();

      switch (op) {
        case 1:
          System.out.print("Digite o valor para depósito: R$ ");
          double deposito = sc.nextDouble();
          if (deposito > 0) {
            saldo += deposito;
            System.out.printf(
              "Depósito realizado! Novo saldo: R$ %.2f\n",
              saldo
            );
          } else {
            System.out.println("Valor inválido!");
          }
          break;
        case 2:
          System.out.print("Digite o valor para saque: R$ ");
          double saque = sc.nextDouble();
          if (saque > 0 && saque <= saldo) {
            saldo -= saque;
            System.out.printf("Saque realizado! Novo saldo: R$ %.2f\n", saldo);
          } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
          }
          break;
        case 3:
          System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
          break;
        case 4:
          System.out.println("Saindo... Obrigado por usar nosso banco!");
          break;
        default:
          System.out.println("Opção inválida! Escolha novamente.");
      }
    } while (op != 4);

    sc.close();
  }
}
