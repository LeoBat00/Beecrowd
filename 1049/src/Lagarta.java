public class Lagarta extends Animal {

    private static final String nome = "lagarta";
    private static final String CARACTERISTICA_STRING = "invertebrado_inseto_herbivoro";

    public boolean isClassificao(String caracteristicas) {
        return (caracteristicas.equals(CARACTERISTICA_STRING));
    }

    public String getNome() {
        return nome;
    }

}