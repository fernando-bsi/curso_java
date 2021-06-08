package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Digite o número da conta Bancária: ");
        int numeroConta = sc.nextInt();
        System.out.println("Digit o nome do Titular: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("vai ser depositado algum valor inicial (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.println("Inserir o valor do depósito: ");
            double deposito = sc.nextDouble();
            conta = new Conta(numeroConta, nome, deposito);
        }
        else {
            conta = new Conta(numeroConta, nome);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Informe o valor do deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Atualizando os dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Informe o valor do saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Atualizando os dados da conta: ");
        System.out.println(conta);


        sc.close();
    }

}
