public class Item {
    private int codigo;
    private double preco;
    private String nome;


    public Item(){
        codigo = 0;
        preco = 0.0;
        nome = "Vazio";
    }

    public Item(int codigo, String nome, double preco){
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

}
