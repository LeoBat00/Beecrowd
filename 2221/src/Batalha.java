import java.util.Scanner;

public class Batalha {
    private int teste;
    private int bonus;


    public Batalha(int teste,Treinador p1, Treinador p2){
        Scanner sc = new Scanner(System.in);
       

        for(int i = 0; i < teste;i++){
            double calculo1 = 0;
            double calculo2 = 0;

            setBonus(sc.nextInt());
            Pomekon pomekon1 = new Pomekon();
            Pomekon pomekon2 = new Pomekon();

            pomekon1.setAtaque(sc.nextInt());
            pomekon1.setDefesa(sc.nextInt());
            p1.setLevel(sc.nextInt());

        
            if(p1.getLevel()%2==0){
                calculo1 = ((pomekon1.getAtaque()+pomekon1.getDefesa())/2)+getBonus();
            }else{
                calculo1 = (pomekon1.getAtaque()+pomekon1.getDefesa())/2;

            }

            pomekon2.setAtaque(sc.nextInt());
            pomekon2.setDefesa(sc.nextInt());
            p2.setLevel(sc.nextInt());     
            
            if(p2.getLevel()%2==0){
                 calculo2 = ((pomekon2.getAtaque()+pomekon2.getDefesa())/2)+getBonus();
            }else{
                 calculo2 = (pomekon2.getAtaque()+pomekon2.getDefesa())/2;

            }

            if(calculo1>calculo2){
                System.out.println(p1.getNome());

            }else if(calculo2>calculo1){
                System.out.println(p2.getNome());
            }else{
                System.out.println("Empate");
            }


            


        }
    }

    public int getBonus() {
        return bonus;
    }
    public int getTeste() {
        return teste;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}
