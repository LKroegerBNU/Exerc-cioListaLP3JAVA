import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);

        String loja = "A Loja Mamão com Açucar";

        System.out.println("Informe o nome do produto: ");
        String produto = inputScanner.next();

        System.out.println("Informe o valor do produto: R$");
        float compra = inputScanner.nextFloat();

        float prestações = 5;
        float totalCompra;

        totalCompra = compra / prestações;

        System.out.println("O valor total do produto é: R$" + compra);
        System.out.println("O valor do produto parcelado em 5x é : R$" + totalCompra);

    }
}
