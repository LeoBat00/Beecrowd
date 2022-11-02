public class Jogo {
    private Jogador jogador1;
    private Jogador jogador2;
    private int dardos;

    public Jogo(){ 
        dardos = 3;      
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public int getDardos() {
        return dardos;
    }

    public void setDardos(int dardos) {
        this.dardos = dardos;
    }

  



}
