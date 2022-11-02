class Aguia extends Animal {

    private static final String nome = "aguia";
    private static final String CARACTERISTICA_STRING = "vertebrado_ave_carnivoro";

    public boolean isClassificao(String caracteristicas) {
        return (caracteristicas.equals(CARACTERISTICA_STRING));
    }

    public String getNome() {
        return nome;
    }

}
