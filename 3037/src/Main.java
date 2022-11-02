import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

    Jogo Jogo1 = new Jogo();
    Jogador p1 = new Jogador("JOÃO"); //Criar um construtor para que já tenha que por o nome do jogador.
    Jogador p2 = new Jogador("MARIA");
    casoDeTeste teste1 = new casoDeTeste(Jogo1,p1,p2);
 
    }
}
