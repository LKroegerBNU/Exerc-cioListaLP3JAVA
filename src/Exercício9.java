import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args){
        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Digite o valor depositado na poupança: R$");
        double valorDepositado = leitorScanner.nextDouble();

        double juros = 0.07 / 100;
        double valorRendimento = valorDepositado * juros;
        double valorTotal = valorDepositado + valorRendimento;

        System.out.printf("Valor depositado na poupança: R$%.2f\n", valorDepositado);
        System.out.printf("Valor do rendimento após um mês: R$%.2f\n", valorRendimento);
        System.out.printf("Valor total após um mês: R$%.2f\n", valorTotal);

    }
}
