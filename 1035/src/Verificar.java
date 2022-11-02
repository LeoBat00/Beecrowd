public class Verificar {
    String resultado;

    boolean Verifica(int A, int B, int C, int D){

        if(B>C&&D>A&&(C+D)>(A+B)&&C>0&&D>0&&A%2==0){
            
            return true;
        }else{
            return false;
        }
    }

    

}
