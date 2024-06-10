package procinterno;

public class CadastroProduto{
    private String nomeDoProduto;
    private String descricaoDoProduto;
    private int precoDoProduto;
    private int quantidadeDoProduto;

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }
    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }
    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }
    public void setDescricaoDoProduto(String descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }
    public int getPrecoDoProduto() {
        return precoDoProduto;
    }
    public void setPrecoDoProduto(int precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }
    public int getQuantidadeDoProduto() {
        return quantidadeDoProduto;
    }
    public void setQuantidadeDoProduto(int quantidadeDoProduto) {
        this.quantidadeDoProduto = quantidadeDoProduto;
    }

    
}
/*     
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
*/