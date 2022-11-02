public class Treinador {
    private int level;
    private String nome;

    public Treinador(String nome){
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
    public String getNome() {
        return nome;
    }

}
