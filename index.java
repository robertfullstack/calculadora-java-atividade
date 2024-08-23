package filesCalculadora;

import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora Simples");
        System.out.println("Escolha uma opera��o:");
        System.out.println("1. Adi��o");
        System.out.println("2. Subtra��o");
        System.out.println("3. Multiplica��o");
        System.out.println("4. Divis�o");
        
        int escolha = scanner.nextInt();
        
        System.out.print("Digite o primeiro n�mero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo n�mero: ");
        double num2 = scanner.nextDouble();
        
        double resultado;
        
        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da adi��o: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtra��o: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplica��o: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divis�o: " + resultado);
                } else {
                    System.out.println("Erro: Divis�o por zero n�o � permitida.");
                }
                break;
            default:
                System.out.println("Escolha inv�lida.");
                break;
        }
        
        scanner.close();
    }
}
