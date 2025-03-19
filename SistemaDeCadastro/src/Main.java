import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Produto> hashProdutos = new HashMap<>();
        int op = 0;


        do{
            System.out.println(" ");
            System.out.println("MENU");
            System.out.println("1- Cadastrar produto");
            System.out.println("2- Buscar produto pelo código");
            System.out.println("3- Sair");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op){
                case 1:
                    System.out.println("Informe o código do novo produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Informe o nome do novo produto: ");
                    String nome = scanner.nextLine();

                    System.out.println("Informe o preço do novo produto: ");
                    double preco = scanner.nextDouble();

                    Produto produto = new Produto(codigo, nome, preco);
                    hashProdutos.put(codigo, produto);
                    System.out.println("Produto cadastrado.");
                    break;

                case 2:
                    System.out.println("Informe o código do produto em que deseja buscar: ");
                    int busca = scanner.nextInt();
                    Produto buscando = hashProdutos.get(busca);

                    if (buscando != null){
                        System.out.println("Produto encontrado: " + buscando);
                    }else{
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Escolha uma opção valida!");

            }
        }while (op != 3);

        scanner.close();
    }
}