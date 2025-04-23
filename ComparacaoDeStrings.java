import java.util.Scanner;
public class ComparacaoDeStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto1 = sc.nextLine();

        System.out.print("Informe outro texto: ");
        String texto2 = sc.nextLine();

        if(texto1.equals(texto2)){
            System.out.println("Os textos são iguais");
        }else{
            System.out.println("Os textos são diferentes");
        }
        sc.close();
    }
}
