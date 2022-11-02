public class Vaca extends Animal {

    private static final String nome = "vaca";
    private static final String CARACTERISTICA_STRING = "vertebrado_mamifero_herbivoro";

    public boolean isClassificao(String caracteristicas) {
        return (caracteristicas.equals(CARACTERISTICA_STRING));
    }

    public String getNome() {
        return nome;
    }

}
