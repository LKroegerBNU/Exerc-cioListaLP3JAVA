import java.util.Scanner;

public class Exercício4 {
    public static void main (String[] args){
        String nomeDoVendedor;
        float salarioFixo = 1500;
        float vendasEfetuadas;
        double comissao = 0.15;
        float salario;
        double salarioFinal;

        Scanner leitorScanner = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor: ");
        nomeDoVendedor = leitorScanner.next();

        System.out.println("Informe a quantidade de vendas efetuadas: ");
        vendasEfetuadas = leitorScanner.nextFloat();

        salario = salarioFixo + vendasEfetuadas;
        salarioFinal = salario * comissao;
        System.out.println("Funcionário: " + nomeDoVendedor + "/ Salário Fixo: R$" + salarioFixo + "/ Salário Final: R$" + (salarioFinal + salario));

    }
}
