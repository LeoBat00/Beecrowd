    import java.util.Scanner;

    public class main {
        public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in);

            Tempo TempoDoJogo = new Tempo();
            Hora horas = new Hora();
            Minuto minutos = new Minuto();

            horas.setValorInicial(sc.nextInt());
            minutos.setValorInicial(sc.nextInt());

            horas.setValorFinal(sc.nextInt());
            minutos.setValorFinal(sc.nextInt());

            //double try1 = horas.TempoTotal();  // 1
            //double try2 = minutos.TempoTotal(); // 2

            TempoDoJogo.calcularTempo(horas, minutos);
            //System.out.println(try1);
            //System.out.println(try2);
            //System.out.println(horas.getValorTotal()); //
            //System.out.println(minutos.getValorTotal()); //
    }
    }

