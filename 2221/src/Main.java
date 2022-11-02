import java.util.Scanner;

public class Main { 
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Treinador treinador1 = new Treinador("Dabriel");
        Treinador treinador2 = new Treinador("Guarte");
        int teste = sc.nextInt();
        Batalha batalha1 = new Batalha(teste, treinador1, treinador2);
        


    }
}
