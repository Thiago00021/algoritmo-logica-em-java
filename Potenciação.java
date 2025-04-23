import java.util.Scanner;
public class Potenciação {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo número inteiro: ");
        int num2 = sc.nextInt();

        double potencia = Math.pow(num1,num2);

        System.out.printf("O número %d elevado por %d é = %.2f", num1, num2, potencia);

        sc.close();
    }
}
