import java.util.Scanner;
public class ElegibilidadeParaVotacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Você já é maior de idade e pode votar");
        }else{
            System.out.println("Você ainda é menor de idade e não pode votar");
        }
        sc.close();
    }
}
