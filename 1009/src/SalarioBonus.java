import java.util.Scanner;
public class SalarioBonus {
    double total;  
    double porcento = 15;  
    
    public SalarioBonus(Usuario usuario){
        Scanner sc = new Scanner(System.in);
        
        usuario.setSalario(sc.nextDouble());
        usuario.setVendas(sc.nextDouble());
        
        total = usuario.getSalario()+((usuario.getVendas()*porcento)/100);

        System.out.printf("TOTAL = %.2f",total);
    }


}
