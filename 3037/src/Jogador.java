public class Jogador {
    private int pontuacao;
    private String nome;
    private int arremeso;
    private int distancia;

    public Jogador(String nomeDoJogador){
        setNome(nomeDoJogador);
        setArremeso(0);        
        setDistancia(0);
        setPontuacao(0);
    }


    public int getArremeso() {
        return arremeso;
    }

    public int getDistancia() {
        return distancia;
    }
    public void setArremeso(int arremeso) {
        this.arremeso = arremeso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
    public String getNome() {
        return nome;
    }
    
    
}
