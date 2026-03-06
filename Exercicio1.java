import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Informe a quantidade de ingressos inteiros: ");
        int ingrA = read.nextInt();
        read.nextLine();
        double valInt = 0.0;
        for (int i = 1; i <= ingrA; i++) {
            System.out.printf("Informe o valor do ingresso %d: ", i);
            String num = read.nextLine();
            num = num.replace(',', '.');
            valInt += Double.parseDouble(num);
        }
        System.out.print("Informe a quantidade de ingressos meia-entrada: ");
        int ingrB = read.nextInt();
        read.nextLine();
        double valMeia = 0.0;
        for (int i = 1; i <= ingrB; i++) {
            System.out.printf("Informe o valor do ingresso %d: ", i);
            String num = read.nextLine();
            num = num.replace(',', '.');
            valMeia += Double.parseDouble(num);
        }
        valMeia *= 0.5;
        System.out.printf("O total arrecado com ingressos inteiros é: %.2f\n", valInt);
        System.out.printf("O total arrecado com ingressos meia-entrada é: %.2f\n", valMeia);
        System.out.printf("O total arrecado na sessão é: %.2f\n", valInt + valMeia);
        System.out.printf("O valor médio pago por ingresso é: %.2f\n", (valInt + valMeia) / (ingrA + ingrB));

        read.close();
    }
}