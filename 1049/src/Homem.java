public class Homem extends Animal {

    private static final String nome = "homem";
    private static final String CARACTERISTICA_STRING = "vertebrado_mamifero_onivoro";

    public boolean isClassificao(String caracteristicas) {
        return (caracteristicas.equals(CARACTERISTICA_STRING));
    }

    public String getNome() {
        return nome;
    }

}