//teste

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

// Classe que representa o cadastro de clientes (vendedores e consumidores)
class CadastroCliente {
    private String nomeDoUsuario;
    private String tipoDeUsuario; // "consumidor" ou "vendedor"
    private String loginDoUsuario;
    private String senhaDoUsuario;
    private String endereco;

    public CadastroCliente(String nomeDoUsuario, String tipoDeUsuario, String loginDoUsuario, String senhaDoUsuario, String endereco) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.tipoDeUsuario = tipoDeUsuario;
        this.loginDoUsuario = loginDoUsuario;
        this.senhaDoUsuario = senhaDoUsuario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nomeDoUsuario;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean verificarLogin(String loginDoUsuario, String senhaDoUsuario) {
        if (this.loginDoUsuario.equals(loginDoUsuario) && this.senhaDoUsuario.equals(senhaDoUsuario)) {
            return true;
        } else {
            return false;
        }
    }
}

// Classe que representa os produtos cadastrados pelos vendedores
class Produtos {
    private String nomeDoProduto;
    private double precoDoProduto;

    public Produtos(String nomeDoProduto, double precoDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.precoDoProduto = precoDoProduto;
    }

    public String getNome() {
        return nomeDoProduto;
    }

    public double getPreco() {
        return precoDoProduto;
    }
}

// Classe que representa o carrinho de compras dos consumidores
class CarrinhoCompras {
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

// Classe que representa a avaliação dos vendedores
class Avaliacao {
    private String nomeVendedor;
    private int notaDaAvaliacao;

    public Avaliacao(String nomeVendedor, int notaDaAvaliacao) {
        this.nomeVendedor = nomeVendedor;
        this.notaDaAvaliacao = notaDaAvaliacao;
    }

    public String getVendedor() {
        return nomeVendedor;
    }

    public int getNota() {
        return notaDaAvaliacao;
    }
}

public class App {
    private LinkedList<CadastroCliente> cadastroClientes; // Lista duplamente encadeada de clientes
    private Stack<Produtos> produtos; // Pilha de produtos
    private TreeSet<String> compras; // Árvore de compras
    private Queue<Avaliacao> avaliacoes; // Fila de avaliações

    public App() {
        cadastroClientes = new LinkedList<>();
        produtos = new Stack<>();
        compras = new TreeSet<>();
        avaliacoes = new LinkedList<>();
    }

    // Método para cadastrar clientes (vendedores ou consumidores)
    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tipo do cliente (consumidor ou vendedor): ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o login do cliente: ");
        String login = scanner.nextLine();
        System.out.print("Digite a senha do cliente: ");
        String senha = scanner.nextLine();
        System.out.print("Digite o endereço do cliente: ");
        String endereco = scanner.nextLine();

        CadastroCliente cliente = new CadastroCliente(nome, tipo, login, senha, endereco);
        cadastroClientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    // Método para cadastrar produtos pelos vendedores
    public void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do vendedor: ");
        String nome = scanner.nextLine();
        CadastroCliente cliente = null;

        for (CadastroCliente c : cadastroClientes) {
            if (c.getNome().equals(nome)) {
                cliente = c;
                break;
            }
        }

        if (cliente == null) {
            System.out.println("Vendedor não encontrado.");
            return;
        }

        if (!cliente.getTipoDeUsuario().equals("vendedor")) {
            System.out.println("Apenas vendedores podem cadastrar produtos.");
            return;
        }

        System.out.print("Digite o login: ");
        String login = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (!cliente.verificarLogin(login, senha)) {
            System.out.println("Login ou senha incorretos.");
            return;
        }

        // Questionário para verificar se o produto atende às diretrizes
        System.out.print("O produto é sustentável? (sim/não): ");
        String sustentavel = scanner.nextLine();
        System.out.print("O produto é de origem reciclada? (sim/não): ");
        String reciclado = scanner.nextLine();
        System.out.print("O produto é 100% orgânico? (sim/não): ");
        String organico = scanner.nextLine();

        if (!sustentavel.equalsIgnoreCase("sim") || !reciclado.equalsIgnoreCase("sim") || !organico.equalsIgnoreCase("sim")) {
            System.out.println("O produto não atende às diretrizes do site.");
            return;
        }

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextDouble()

        Produtos produto = new Produtos(nomeProduto, preco);
        produtos.push(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    // Método para adicionar produtos ao carrinho de compras dos consumidores
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

    // Método para efetivar a compra de produtos do carrinho
    public void efetivarCompra(CarrinhoCompras carrinho, CadastroCliente cliente) {
        if (carrinho.getProdutos().isEmpty()) {
            System.out.println("Carrinho vazio.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha a forma de pagamento (Pix, cartão de crédito ou débito): ");
        String formaPagamento = scanner.nextLine();

        System.out.println("Verificando a localização do vendedor...");
        for (Produtos produto : carrinho.getProdutos()) {
            for (CadastroCliente vendedor : cadastroClientes) {
                if (vendedor.getTipoDeUsuario().equals("vendedor") && produtos.contains(produto)) {
                    if (vendedor.getEndereco().equals(cliente.getEndereco())) {
                        System.out.println("Comprador e vendedor são da mesma cidade.");
                        System.out.print("Deseja retirar o produto diretamente com o vendedor? (sim/não): ");
                        String retirar = scanner.nextLine();
                        if (retirar.equalsIgnoreCase("sim")) {
                            System.out.println("Você optou por retirar o produto diretamente com o vendedor.");
                        } else {
                            System.out.println("Você optou pela entrega do produto.");
                        }
                    } else {
                        System.out.println("Comprador e vendedor não são da mesma cidade.");
                        System.out.print("Digite o endereço para entrega: ");
                        String enderecoEntrega = scanner.nextLine();
                        System.out.println("O produto será entregue no endereço: " + enderecoEntrega);
                    }
                }
            }
        }

        double total = carrinho.calcularTotal();
        System.out.println("Total da compra: R$" + total);
        compras.add(cliente.getNome() + " comprou " + carrinho.getProdutos().size() + " produtos por R$" + total);
        carrinho.getProdutos().clear();
        System.out.println("Compra efetivada com sucesso!");
    }

    // Método para avaliar vendedores após a compra
    public void avaliarVendedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do vendedor: ");
        String vendedor = scanner.nextLine();
        System.out.print("Digite a nota do vendedor (0-10): ");
        int nota = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

        Avaliacao avaliacao = new Avaliacao(vendedor, nota);
        avaliacoes.add(avaliacao);
        System.out.println("Avaliação realizada com sucesso!");
    }


}
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

class Cliente {
    private String nome;
    private String tipo; // "consumidor" ou "vendedor"
    private String login;
    private String senha;

    public Cliente(String nome, String tipo, String login, String senha) {
        this.nome = nome;
        this.tipo = tipo;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean verificarLogin(String login, String senha) {
        if (this.tipo.equals("vendedor") && this.login.equals(login) && this.senha.equals(senha)) {
            return true;
        } else {
            System.out.println("Apenas vendedores podem inserir produtos");
            return false;
        }
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class Avaliacao {
    private String vendedor;
    private int nota;

    public Avaliacao(String vendedor, int nota) {
        this.vendedor = vendedor;
        this.nota = nota;
    }

    public String getVendedor() {
        return vendedor;
    }

    public int getNota() {
        return nota;
    }
}

public class MercadoLivre {
    private LinkedList<Cliente> clientes;
    private Stack<Produto> produtos;
    private TreeSet<String> compras;
    private Queue<Avaliacao> avaliacoes;

    public MercadoLivre() {
        clientes = new LinkedList<>();
        produtos = new Stack<>();
        compras = new TreeSet<>();
        avaliacoes = new LinkedList<>();
    }

    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tipo do cliente (consumidor ou vendedor): ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o login do cliente: ");
        String login = scanner.nextLine();
        System.out.print("Digite a senha do cliente: ");
        String senha = scanner.nextLine();
        Cliente cliente = new Cliente(nome, tipo, login, senha);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void cadastrarProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        Cliente cliente = null;
        for (Cliente c : clientes) {
            if (c.getNome().equals(nome)) {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }
        if (cliente.getTipo().equals("consumidor")) {
            System.out.println("Apenas vendedores podem inserir produtos");
            return;
        }
        System.out.print("Digite o login: ");
        String login = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        if (!cliente.verificarLogin(login, senha)) {
            System.out.println("Login ou senha incorretos.");
            return;
        }
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
        System.out.print("Digite o preco do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextDouble()
        Produto produto = new Produto(nomeProduto, preco);
        produtos.push(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    public void efetivarCompra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do consumidor: ");
        String consumidor = scanner.nextLine();
        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();
        compras.add(consumidor + " comprou " + produto);
        System.out.println("Compra efetivada com sucesso!");
    }

    public void avaliarVendedor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do vendedor: ");
        String vendedor = scanner.nextLine();
        System.out.print("Digite a nota do vendedor (0-10): ");
        int nota = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
        Avaliacao avaliacao = new Avaliacao(vendedor, nota);
        avaliacoes.add(avaliacao);
        System.out.println("Avaliação realizada com sucesso!");
    }

    public void imprimirRelatorio() {
        System.out.println("Relatório de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("Nome: " + cliente.getNome() + ", Tipo: " + cliente.getTipo());
        }

        System.out.println("Relatório de produtos:");
        for (Produto produto : produtos) {
            System.out.println("Nome: " + produto.getNome() + ", Preco: " + produto.getPreco());
        }

        System.out.println("Relatório de compras:");
        for (String compra : compras) {
            System.out.println(compra);
        }

        System.out.println("Relatório de avaliações:");
        for (Avaliacao avaliacao : avaliacoes) {
            System.out.println("Vendedor: " + avaliacao.getVendedor() + ", Nota: " + avaliacao.getNota());
        }
    }

    public static void main(String[] args) {
        MercadoLivre mercadoLivre = new MercadoLivre();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Cadastrar produto");
            System.out.println("3. Efetivar compra");
            System.out.println("4. Avaliar vendedor");
            System.out.println("5. Imprimir relatório");
            System.out.println("6. Sair do sistema");
            System.out.print("Digite a opção desejada: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()

            switch (opcao) {
                case 1:
                    mercadoLivre.cadastrarCliente();
                    break;
                case 2:
                    mercadoLivre.cadastrarProduto();
                    break;
                case 3:
                    mercadoLivre.efetivarCompra();
                    break;
                case 4:
                    mercadoLivre.avaliarVendedor();
                    break;
                case 5:
                    mercadoLivre.imprimirRelatorio();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
