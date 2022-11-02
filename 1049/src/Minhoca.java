public class Minhoca extends Animal {

    private static final String nome = "minhoca";
    private static final String CARACTERISTICA_STRING = "invertebrado_anelideo_onivoro";

    public boolean isClassificao(String caracteristicas) {
        return (caracteristicas.equals(CARACTERISTICA_STRING));
    }

    public String getNome() {
        return nome;
    }

}
