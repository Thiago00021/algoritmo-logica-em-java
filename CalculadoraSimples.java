import java.util.Scanner;
public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num1 = sc.nextInt();
        System.out.print("Informe um segundo número inteiro: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Módulo(Resto da divisão) = " + modulo);

        sc.close();
    }
}
