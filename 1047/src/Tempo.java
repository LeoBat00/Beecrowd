public class Tempo {
    private double valorFinal;
    private double valorTotal = 0;
    private double valorInicial;


    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }


    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
    public double getValorFinal() {
        return valorFinal;
    }
    public double getValorInicial() {
        return valorInicial;
    }

    public double TempoTotal() {
        return valorFinal - valorInicial;
    }

    
    public void calcularTempo(Hora horas, Minuto minutos) {
        horas.setValorTotal(horas.getValorFinal()-horas.getValorInicial());
        minutos.setValorTotal(minutos.getValorFinal()-minutos.getValorInicial());

        if (horas.TempoTotal()<=0){
            horas.setValorTotal(24+horas.getValorTotal());
           // System.out.println("Passou por aqui x1");
        }
        
        if(minutos.TempoTotal()<0){
            minutos.setValorTotal(minutos.getValorTotal()+60);
            horas.setValorTotal((horas.getValorTotal()-1));
            //System.out.println("Passou por aqui x2");
        }
        


        if(horas.getValorTotal()==0&&minutos.getValorTotal()==0){
            System.out.printf("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)\n");

        }else if(horas.getValorTotal()==24&&minutos.getValorTotal()!=0){
            System.out.printf("O JOGO DUROU 0 HORA(S) E %.0f MINUTO(S)\n",minutos.getValorTotal());

        }else{
            System.out.printf("O JOGO DUROU %.0f HORA(S) E %.0f MINUTO(S)\n",horas.getValorTotal(),minutos.getValorTotal());
        }


    }


}
