import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        float distancia;
        float combustivelGasto;
        float consumoMedio;

        Scanner leitoScanner = new Scanner(System.in);

        System.out.println("Informe a distância total percorrida: ");
        distancia = leitoScanner.nextInt();

        System.out.println("Informe o gasto de combustível: ");
        combustivelGasto = leitoScanner.nextInt();

        consumoMedio = distancia / combustivelGasto;

        System.out.println("O consumo medio de combustível é de: " + consumoMedio + "km/l");
    }
}
