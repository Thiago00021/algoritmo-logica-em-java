import java.util.Scanner;
public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("O número é igual a 0.");
        } else if(num > 0){
            System.out.println("O número é positivo.");
        }else{
            System.out.println("O número é negativo.");
        }
        sc.close();
    }
}
