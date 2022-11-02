public  class Pulga extends Animal {

    private static final String nome = "pulga";
    private static final String CARACTERISTICA_STRING = "invertebrado_inseto_hematofago";

    public boolean isClassificao(String caracteristicas) {
        return (caracteristicas.equals(CARACTERISTICA_STRING));
    }

    public String getNome() {
        return nome;
    }

}