import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {

  public static void main(String[] args) {
     int opcao = 0;
     Scanner sc = new Scanner(System.in);
     ArrayList<Venda> vendas = new ArrayList<>();

     do{
         System.out.println("Bem vindo a vendinha da dona Gabrielinha");
         System.out.println("[1] - Calcular valor total");
         System.out.println("[2] - Calcular troco");
         System.out.println("[3] - Mostrar historico de vendas");
         System.out.println("[4] - Sair");
         opcao = sc.nextInt();

         switch(opcao){

             case 1:
                 System.out.println("Insira a quantidade comprada");
                 int quantidade = sc.nextInt();

                 System.out.println("Insira o preco unitario(ex: 10,50");
                 double precoUnitario = sc.nextDouble();

                 double total = CalculadoraVenda.calcularTotal(quantidade, precoUnitario);
                 double desconto = CalculadoraVenda.calcularDesconto(quantidade, total);
                 double valorFinal = CalculadoraVenda.calcularFinal(total, desconto);

                 Venda venda = new Venda(quantidade, total, desconto, valorFinal);
                 vendas.add(venda);

                 System.out.println("Valor final da sua compra: R$ " + valorFinal);

                break;

             case 2:
                 System.out.println("Valor da compra");
                 double compra = sc.nextDouble();
                 sc.nextLine();

                 System.out.println("Valor recebido");
                 double recebido = sc.nextDouble();
                 sc.nextLine();

                 double troco = CalculadoraVenda.retornarTroco(compra, recebido);

                 if (troco <= 0){
                     System.out.println("Nao a troco a ser retornado");
                 }else {
                     System.out.println("Troco: R$ " + troco);
                 }
                 break;

             case 3:
                 System.out.println("Vendas registradas: ");
                 for (Venda v: vendas){
                     v.mostrarVenda();
                 }

                 break;

             case 4:
                 System.out.println("Encerrando o sistema");

                 break;

             default:
                 System.out.println("Opcao invalida");
         }
     } while (opcao != 4);

     sc.close();

  }
}
