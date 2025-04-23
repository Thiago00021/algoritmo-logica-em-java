import java.util.Scanner;
public class VerificacaoDeIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num1 = sc.nextInt();

        if(num1 >= 10 && num1 <= 20){
            System.out.println("O número digitado está no intervalo entre 10 e 20");
        }else{
            System.out.println("O número digitado não está no intervalo entre 10 e 20");
        }
        sc.close();
    }
}
