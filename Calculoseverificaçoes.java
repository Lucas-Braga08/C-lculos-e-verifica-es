/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadetpa;

/**
 *
 * @author lucas
 */
import java.util.Scanner;

public class Atividadetpa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nao MENU ");
            System.out.println("1. Calculadora");
            System.out.println("2. Conversor de Temperatura (Celsius)");
            System.out.println("3. Verificador de Numero Primo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    calculadora(scanner);
                    break;
                case 2:
                    conversorTemperatura(scanner);
                    break;
                case 3:
                    verificadorPrimo(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void calculadora(Scanner scanner) {
        System.out.println("\n Calculadora ");
        System.out.println("Escolha a operacao:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtracao (-)");
        System.out.println("3 - Multiplicacao (*)");
        System.out.println("4 - Divisao (/)");
        System.out.print("Opcao: ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Erro: Divisao por zero nao e permitida.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Operacao invalida!");
        }
    }

    public static void conversorTemperatura(Scanner scanner) {
        System.out.println("\n Conversor de Temperatura ");
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;
        double kelvin = celsius + 273.15;

        System.out.printf("Fahrenheit: %.2f°F\n", fahrenheit);
        System.out.printf("Kelvin: %.2fK\n", kelvin);
    }

    public static void verificadorPrimo(Scanner scanner) {
        System.out.println("\n Verificador de Numeros Primos ");
        String continuar;

        do {
            System.out.print("Digite um numero inteiro: ");
            int numero = scanner.nextInt();

            if (numero <= 1) {
                System.out.println(numero + " nao e primo.");
            } else {
                boolean primo = true;
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    System.out.println(numero + " e primo.");
                } else {
                    System.out.println(numero + " nao e primo.");
                }
            }

            System.out.print("Deseja verificar outro numero? (sim/nao): ");
            continuar = scanner.next();
        } while (continuar.equalsIgnoreCase("sim"));
    }
}


