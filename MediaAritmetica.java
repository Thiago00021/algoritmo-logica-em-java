import java.util.Scanner;
public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== CAlCULANDO A MÉDIA DE 3 NÚMEROS INTEIROS ====== ");

        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Informe o terceiro número: ");
        int num3 = sc.nextInt();

        int media = (num1 + num2 + num3) / 3;

        System.out.println("A média entre os 3 números é = " + media);

        sc.close();
    }
}
