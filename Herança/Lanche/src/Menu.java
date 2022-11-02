public class Menu {
    Item[] itens = new Item[5];

    public Menu(){
        itens[0] = new Item(1,"Cachorro Quente",4.00);
        itens[1] = new Item(2,"X-Salada",4.50);
        itens[2] = new Item(3,"X-Bacon",5.00);
        itens[3] = new Item(4,"Torrada Simples",2.00);
        itens[4] = new Item(5,"Refrigerante",1.50);
    }

}