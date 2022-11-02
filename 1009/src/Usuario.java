    import java.util.Scanner;
    public class Usuario {
        private String nome;
        private double vendas;
        private double salario;
        SalarioBonus salarioTotal;

        public Usuario(){
        Scanner sc = new Scanner(System.in);

        setNome(sc.nextLine());
        
        
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getVendas() {
            return vendas;
        }

        public void setVendas(double vendas) {
            this.vendas = vendas;
        }
        public String getNome() {
            return nome;
        }

        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }
    }
