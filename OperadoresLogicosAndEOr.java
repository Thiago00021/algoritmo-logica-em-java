import java.util.Scanner;
public class OperadoresLogicosAndEOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número inteiro: ");
        int num3 = sc.nextInt();

        if(num1 > 10 || num2 > 10 || num3 > 10){
            System.out.println("Um dos três números é maior que 10");
        } else {
            System.out.println("Nenhum dos números é maior que 10.");
        }

        if (num1 > 10 && num2 > 10 && num3 > 10) {
            System.out.println("Todos os números são maiores que 10.");
        }else {
            System.out.println("Nem todos os números são maiores que 10");
        }


        sc.close();
    }
}
