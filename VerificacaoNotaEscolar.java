import java.util.Scanner;
public class VerificacaoNotaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a nota escolar de (0 a 10): ");
        int notaEscolar = sc.nextInt();

        if(notaEscolar < 5){
            System.out.println("Nota insuficiente");
        } else if(notaEscolar >= 5 && notaEscolar <= 7){
            System.out.println("Nota suficiente");
        }else{
            System.out.println("Excelente");
        }
        sc.close();
    }
}
