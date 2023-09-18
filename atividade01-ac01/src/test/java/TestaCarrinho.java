import java.util.Scanner;

public class TestaCarrinho {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();
        Scanner in = new Scanner(System.in);
        Scanner inNl = new Scanner(System.in);
        int opcaoMenu;
        do{
            System.out.println("1 - Adicionar Livro");
            System.out.println("2 - Adicionar DVD");
            System.out.println("3 - Adicionar Serviço");
            System.out.println("4 - Exibir itens do carrinho");
            System.out.println("5 - Calcular total da venda");
            System.out.println("6 - Sair");
            System.out.println("Digite a opção desejada: ");
            opcaoMenu = in.nextInt();
            switch (opcaoMenu) {
                case 1:
                    System.out.println("Adicionar Livro");
                    System.out.println("Digite o código do livro: ");
                    int codigoLivro = in.nextInt();
                    System.out.println("Digite o preço de custo do livro: ");
                    double precoCustoLivro = in.nextDouble();
                    System.out.println("Digite o nome do livro: ");
                    String nomeLivro = inNl.nextLine();
                    System.out.println("Digite o nome do autor do livro: ");
                    String autorLivro = inNl.nextLine();
                    System.out.println("Digite o ISBN do livro: ");
                    String isbnLivro = inNl.nextLine();
                    Livro livro = new Livro(codigoLivro, precoCustoLivro, nomeLivro, autorLivro, isbnLivro);
                    carrinho.adicionaVendavel(livro);
                    break;
                case 2:
                    System.out.println("Adicionar DVD");
                    System.out.println("Digite o código do DVD: ");
                    int codigoDvd = in.nextInt();
                    System.out.println("Digite o preço de custo do DVD: ");
                    double precoCustoDvd = in.nextDouble();
                    System.out.println("Digite o nome do DVD: ");
                    String nomeDvd = inNl.nextLine();
                    System.out.println("Digite o nome da gravadora do DVD: ");
                    String gravadoraDvd = inNl.nextLine();
                    Dvd dvd = new Dvd(codigoDvd, precoCustoDvd, nomeDvd, gravadoraDvd);
                    carrinho.adicionaVendavel(dvd);
                    break;
                case 3:
                    System.out.println("Adicionar Serviço");
                    System.out.println("Digite o código do serviço: ");
                    int codigoServico = in.nextInt();
                    System.out.println("Digite a quantidade de horas do serviço: ");
                    int quantHorasServico = in.nextInt();
                    System.out.println("Digite o valor da hora do serviço: ");
                    double valorHoraServico = in.nextDouble();
                    System.out.println("Digite a descrição do serviço: ");
                    String descricaoServico = inNl.nextLine();
                    Servico servico = new Servico(descricaoServico, codigoServico, quantHorasServico, valorHoraServico);
                    carrinho.adicionaVendavel(servico);
                    break;
                case 4:
                    System.out.println("Exibir itens do carrinho");
                    carrinho.exibeItensCarrinho();
                    break;
                case 5:
                    System.out.println("Calcular total da venda");
                    System.out.println("Total da venda: " + carrinho.calculaTotalVenda());
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;


            }
        }while (opcaoMenu != 6);
    }
}
