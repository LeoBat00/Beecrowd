import java.util.Scanner;

public class Pedido {
    private int codigo;
    private int quantidade;
    private double precoTotal;

    public Pedido(Menu menu){
        Scanner sc = new Scanner(System.in);
        codigo = sc.nextInt();
        quantidade = sc.nextInt();

        precoTotal = menu.itens[quantidade].getPreco()*quantidade;
    }

    public void getPedido(){
        System.out.printf("Total: R$ %.2f\n",precoTotal);
 
    }



}
