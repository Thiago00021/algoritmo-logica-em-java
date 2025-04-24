import java.util.Scanner;
public class ClassificacaoDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma nota de 0 a 100: ");
        int nota = sc.nextInt();

        if(nota >= 60){
            System.out.println("Parabéns, você está APROVADO!(A)");
        }else{
            System.out.println("Que pena ..... você está REPROVADO(A)!");
        }
        sc.close();
    }
}
