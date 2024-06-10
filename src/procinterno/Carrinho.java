package procinterno;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produtos> produto;

    public CarrinhoCompras() {
        this.produto = new ArrayList<>();
    }

    public void adicionarProduto(Produtos produto) {
        this.produto.add(produto);
    }

    public void removerProduto(Produtos produto) {
        this.produto.remove(produto);
    }

    public List<Produtos> getProdutos() {
        return this.produto;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produtos Produtos : produto) {
            total += Produtos.getPreco();
        }
        return total;
    }
}

public void adicionarAoCarrinho(CarrinhoCompras carrinho) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o nome do produto: ");
    String nomeProduto = scanner.nextLine();
    Produtos produto = null;

    for (Produtos p : produtos) {
        if (p.getNome().equals(nomeProduto)) {
            produto = p;
            break;
        }
    }

    if (produto == null) {
        System.out.println("Produto não encontrado.");
        return;
    }

    carrinho.adicionarProduto(produto);
    System.out.println("Produto adicionado ao carrinho!");
}