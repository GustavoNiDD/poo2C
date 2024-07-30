public class Funcionario {
    public double calcularDesconto(double consumo){
        if(consumo > 1000){
            return consumo * 0.30;
        }else{
            return 0;
        }
    }
}
