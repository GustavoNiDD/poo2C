public class App {
    public static void main(String[] args) throws Exception {
        
        VIP vip = new VIP();
        Regular regular = new Regular();
        Funcionario funcionario = new Funcionario();

        // vip.calcularDesconto(10000);
        // regular.calcularDesconto(10000);
        // funcionario.calcularDesconto(10000);

        System.out.println(vip.calcularDesconto(10000));
        System.out.println(regular.calcularDesconto(10000));
        System.out.println(funcionario.calcularDesconto(10000));



    }
}
