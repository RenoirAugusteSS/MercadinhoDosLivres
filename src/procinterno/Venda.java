package procinterno;

public class Venda {
    System.out.println("Relatório de vendas.\n");

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
