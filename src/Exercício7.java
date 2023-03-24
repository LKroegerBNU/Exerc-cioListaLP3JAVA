import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args){
        Scanner leitoScanner = new Scanner(System.in);

        float temperaturaC;
        float temperaturaF;

        System.out.println("Informe a temperatura (Cº): ");
        temperaturaC = leitoScanner.nextFloat();

        temperaturaF = (9 * temperaturaC + 160) / 5;

        System.out.println("A temperatura em graus Celcius é: " + temperaturaC + "C - A temperatura em graus Fahrenheit é: " + temperaturaF + "F");
    }
}
