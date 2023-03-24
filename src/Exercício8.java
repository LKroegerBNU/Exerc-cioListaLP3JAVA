import java.util.Scanner;

public class Exercício8 {
    public static void main(String[] args){
        Scanner leitoScanner = new Scanner(System.in);

        float real;
        float dolar;
        float conversaoDolar;

        System.out.println("Informe a quantidade de dinheiro (Real): ");
        real = leitoScanner.nextFloat();

        System.out.println("Informe a cotação do dolar: ");
        dolar = leitoScanner.nextFloat();

        conversaoDolar = real * dolar;

        System.out.println("Quantidade de dinheiro em real: R$" + real);
        System.out.println("O valor do dolar é: US$" + dolar);
        System.out.println("Dolares: US$" + conversaoDolar);
    }
}
