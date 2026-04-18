import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entre com o nome do produto");
        System.out.println("Nome: ");
        String nome = input.nextLine();

        System.out.println("Preco: ");
        double preco = input.nextDouble();


        Produto produto = new Produto(nome, preco);


        System.out.println();
        System.out.println("Dados do produto: " + produto);

        System.out.println();
        System.out.println("Digite a quantidade de produtos a serem adicionados ao estoque: ");
        int quantidade = input.nextInt();
        produto.adicionarEmEstoque(quantidade);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println();
        System.out.println("Digite a quantidade de produtos a serem removido do estoque: ");
        int quantidadeRemove = input.nextInt();
        produto.removerEmEstoque(quantidadeRemove);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        input.close();


    }
}
