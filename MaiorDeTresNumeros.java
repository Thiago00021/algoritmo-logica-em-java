import java.util.Scanner;
public class MaiorDeTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int num2 = sc.nextInt();

        System.out.print("Digite um terceiro número inteiro: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("O primeiro número é maior");
        } else if(num2 > num1 && num2 > num3){
            System.out.println("O segundo número é maior");
        }else{
            System.out.println("O terceiro número é maior");
        }
        sc.close();
    }
}
