public class Calculo {
    double resultdo;

    void somar(int valor1,int valor2){
        this.resultdo = valor1+valor2;

    }
    void prod(int valor1,int valor2){
        this.resultdo = valor1*valor2;

    }

    void media1(double valor1, double valor2){
        valor1 *= 3.5;
        valor2 *= 7.5;
        this.resultdo = (valor1+valor2)/11;
    }
}
