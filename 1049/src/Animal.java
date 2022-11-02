abstract class Animal {

    public abstract boolean isClassificao(String caracteristicas);

    public abstract String getNome();

    public static Animal[] criaAnimais() {

        Animal a1[] = new Animal[8];
        a1[0] = new Aguia();
        a1[1] = new Pomba();
        a1[2] = new Homem();
        a1[3] = new Vaca();
        a1[4] = new Pulga();
        a1[5] = new Lagarta();
        a1[6] = new Sanguessuga();
        a1[7] = new Minhoca();
        return a1;
    }
}