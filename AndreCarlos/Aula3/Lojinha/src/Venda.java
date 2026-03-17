public class Venda {

    public int quantidade;
    public double precoUnitario;
    public double desconto;
    public double valorFinal;

    public Venda(int quantidade, double precoUnitario, double desconto, double valorFinal){
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.desconto = desconto;
        this.valorFinal = valorFinal;

    }
    public void mostrarVenda(){
        System.out.println("Quantidade adquirida: " + quantidade);
        System.out.println("Preco unitario: R$ "+ precoUnitario);
        System.out.println("Valor descontado: R$ " + desconto);
        System.out.println("Valor final da compra: R$ " + valorFinal);
    }
}
