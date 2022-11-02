public  class Pomba extends Animal {

    private static final String nome = "pomba";
    private static final String CARACTERISTICA_STRING = "vertebrado_ave_onivoro";

    public boolean isClassificao(String caracteristicas) {
        return (caracteristicas.equals(CARACTERISTICA_STRING));
    }

    public String getNome() {
        return nome;
    }

}