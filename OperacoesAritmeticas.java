public class OperacoesAritmeticas {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 3;
        int soma = numero1 + numero2;
        int sub = numero1 - numero2;
        int mult = numero1 * numero2;
        double divisao = numero1 / numero2;
        int modulo = numero1 % numero2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto da divisão: " + modulo);
    }
}
