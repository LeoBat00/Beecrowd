import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Verificar sequencia = new Verificar();

        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();
        int valor4 = scan.nextInt();
        
        boolean Resultado = sequencia.Verifica(valor1, valor2, valor3, valor4);

        if(Resultado==true){
            System.out.println("Valores aceitos");
        }else{ 
            System.out.println("Valores nao aceitos");
        }
    }
}
