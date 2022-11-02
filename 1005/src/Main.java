import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Calculo soma1 = new Calculo();
        double valor1 = scan.nextDouble();
        double valor2 = scan.nextDouble();
        scan.close();

        soma1.media1(valor1,valor2);

        System.out.printf("MEDIA = %.5f ",soma1.resultdo);
    }
}
