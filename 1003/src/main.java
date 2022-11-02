import java.util.Scanner;


public class main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Calculo soma1 = new Calculo();
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        scan.close();

        soma1.somar(valor1,valor2);

        System.out.println("SOMA = "+soma1.resultdo);
    }
}

