package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();
        System.out.println("Digite o número da conta Bancária: ");
        conta.numeroConta = sc.nextDouble();
        System.out.println("Digit o nome do Titular: ");
        conta.nome = sc.next();
        System.out.println("Digite o valor do depósito inicial (caso nao tenha digitar 0): ");
        conta.deposito = sc.nextDouble();

        System.out.println("realizar ");



        sc.close();
    }

}
