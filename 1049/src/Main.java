import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.nextLine();
        String c2 = sc.nextLine();
        String c3 = sc.nextLine();

        String caracteristicas = c1 + "_" + c2 + "_" + c3;

        Animal a1[] = Animal.criaAnimais();

        for(Animal a : a1) {
            if(a.isClassificao(caracteristicas)) {
                System.out.println(a.getNome());
                break;
            }
            
        }

        sc.close();

    }
    
}