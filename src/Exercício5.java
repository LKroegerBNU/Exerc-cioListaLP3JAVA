import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args){
        String nomeDoAluno;
        float nota1;
        float nota2;
        float nota3;
        float media;

        Scanner leitoScanner = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        nomeDoAluno = leitoScanner.next();

        System.out.println("Primeira nota: ");
        nota1 = leitoScanner.nextFloat();

        System.out.println("Segunda nota: ");
        nota2 = leitoScanner.nextFloat();

        System.out.println("Terceira nota: ");
        nota3 = leitoScanner.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média do aluno é: " + media);
    }
}
