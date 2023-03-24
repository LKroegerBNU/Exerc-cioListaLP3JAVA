import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args){
        Scanner leitorScanner = new Scanner(System.in);

        int varA;
        int varB;
        int trocaA;
        int trocaB;

        System.out.println("Informe o valor de A:");
        varA = leitorScanner.nextInt();

        System.out.println("Informe o valor de B:");
        varB = leitorScanner.nextInt();

        trocaA = varB;
        trocaB = varA;

        System.out.println("O valor de A: " + trocaA + ", O valor de B: " + trocaB);
    }
}
