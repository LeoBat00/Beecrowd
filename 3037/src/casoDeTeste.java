import java.util.Scanner;
 
public class casoDeTeste {
    private double Contador1;
    private double Contador2;
    private int teste;

    public casoDeTeste(Jogo jogo, Jogador p1, Jogador p2){

        Scanner sc = new Scanner(System.in);
        teste = sc.nextInt();

        double contador1 = 0;
        double contador2 = 0;
        
        for(int i = 0; i < teste; i++){
            contador1 = 0;
            contador2 = 0;

            for(int e = 0; e < jogo.getDardos();e++){
                p1.setArremeso(sc.nextInt());
                p1.setDistancia(sc.nextInt());

                contador1 = (p1.getArremeso()*p1.getDistancia())+contador1;
            }
            for(int m = 0; m < jogo.getDardos();m++){
                p2.setArremeso(sc.nextInt()) ;
                p2.setDistancia(sc.nextInt());

                contador2 = (p2.getArremeso()*p2.getDistancia())+contador2;
            }
            if(contador1>contador2){
                System.out.printf(p1.getNome());
            }else{
                System.out.println(p2.getNome());
            }


        }
        
        
        
    }
    public double getContador1() {
        return this.Contador1;
        }

    public double getContador2() {
        return Contador2;
        }
}
