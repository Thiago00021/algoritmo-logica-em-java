import java.util.Scanner;
public class AvaliacaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a temperatura em gruas °C: ");
        double temperaturaCelsius = sc.nextDouble();

        if(temperaturaCelsius < 15){
            System.out.println("O clima está frio");
        } else if(temperaturaCelsius >= 15 && temperaturaCelsius <= 30){
            System.out.println("O clima está agradável");
        }else{
            System.out.println("O clima está quente");
        }
        sc.close();
    }
}
