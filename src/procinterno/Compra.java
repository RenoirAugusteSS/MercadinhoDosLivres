package procinterno;

public class Compra {
    
}
    /* 
            Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do consumidor: ");
        String consumidor = scanner.nextLine();
        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();
        compras.add(consumidor + " comprou " + produto);
        System.out.println("Compra efetivada com sucesso!");
}
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
*/