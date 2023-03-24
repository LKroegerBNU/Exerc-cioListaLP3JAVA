import java.util.Scanner;

public class Exercício20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;

        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;

        char desejaRepetir = 's';

        while (desejaRepetir == 's' || desejaRepetir == 'S'){
            
            System.out.println("Digite o ano de fabricação do veículo");
            anoFabricacao = input.nextInt();
            System.out.println("Digite o valor do veículo");
            valorCarro = input.nextFloat();

            if(anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }

            totalCarros++;

            valorDesconto = valorCarro + porcentagemDesconto;
            valorPagar = valorCarro - valorDesconto;

            System.out.println("Deseja fazer mais cadastros? S - Sim / N - Não");
            desejaRepetir = input.next().charAt(0);
        }
        System.out.println("Tota de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
    }
}
