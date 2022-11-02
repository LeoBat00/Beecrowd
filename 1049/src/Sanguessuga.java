public  class Sanguessuga extends Animal {

    private static final String nome = "sanguessuga";
    private static final String CARACTERISTICA_STRING = "invertebrado_anelideo_hematofago";

    public boolean isClassificao(String caracteristicas) {
        return (caracteristicas.equals(CARACTERISTICA_STRING));
    }

    public String getNome() {
        return nome;
    }

}

