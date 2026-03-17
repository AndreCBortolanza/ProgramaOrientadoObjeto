public class CalculadoraVenda {

    public static double calcularTotal(int quantidade, double preco){
        return quantidade*preco;
    }
    public static double calcularDesconto(int quantidade, double total){
        if(quantidade > 10){
            return total*0.05;
        } else{
            return 0;
        }
    }

    public static double calcularFinal(double total, double desconto){
        return total - desconto;

    }

    public static double retornarTroco(double recebido, double compra){
        return recebido-compra;
    }

}
