import java.io.IOException;
import java.util.Scanner;

public class main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        Calculo Soma1 = new Calculo();
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        scan.close();

        Soma1.somar(valor1, valor2);
        System.out.println(Soma1.resultado);
        }
}
