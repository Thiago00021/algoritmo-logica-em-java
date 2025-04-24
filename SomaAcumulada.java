import java.util.Scanner;
public class SomaAcumulada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaAcumulada = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int valorDigitado = scanner.nextInt();
            somaAcumulada += valorDigitado;
        }
        System.out.println("Soma acumulada: " + somaAcumulada);
    }
}
