package filesCalculadora;

import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora Simples");
        System.out.println("Escolha uma operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        
        int escolha = scanner.nextInt();
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado;
        
        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }
        
        scanner.close();
    }
}
