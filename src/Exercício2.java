import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) throws Exception{
        float numero1;
        float numero2;
        float resultado;
        Scanner leitoScanner = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        numero1 = leitoScanner.nextInt();

        System.out.println("Informe o segundo número: ");
        numero2 = leitoScanner.nextInt();

        resultado = numero1 + numero2;
        resultado= numero1 - numero2;
        resultado = numero1 * numero2;
        resultado = numero1 / numero2;

        System.out.println("Soma: " + (numero1+numero2) + " Subtração: " + (numero1-numero2) + " Multiplicação: " + (numero1*numero2) + " Divisão: " + (numero1/numero2));
    }
}
