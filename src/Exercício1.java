import java.util.Scanner;


public class Exercício1 {


    public static void main(String[] args) throws Exception {
    int numero1;
    int numero2;
    int resultado;
    Scanner leitoScanner = new Scanner(System.in);
    
    System.out.println("Digite o primeiro número");
    numero1 = leitoScanner.nextInt();

    System.out.println("Digite o segundo número");
    numero2 = leitoScanner.nextInt();

    resultado = numero1 + numero2;

    System.out.println("O resultado da soma é: " + resultado);
    }
}
