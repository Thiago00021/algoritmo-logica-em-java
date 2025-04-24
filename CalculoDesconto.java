import java.util.Scanner;
import java.util.Locale;

public class CalculoDesconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        System.out.print("Informe o valor da compra: ");
        double compra = sc.nextDouble();

        double desconto = compra * 0.10;

        double valorFinal = compra - desconto;

        if(compra > 100){
            System.out.println("Sua compra excedeu R$ 100.00 e você ganhou um desconto de 10%.");
            System.out.printf("Valor total a pagar = R$ %.2f%n",valorFinal);
        }else{
            System.out.println("Sua compra não execeu R$ 100.00");
            System.out.printf("Valor total a pagar = R$ %.2f", compra);
        }
        sc.close();
    }
}
