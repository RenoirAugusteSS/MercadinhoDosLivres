package procinterno;

public class Avaliacao {
    private String nomeVendedor;
    private int notaAvaliacao;

    public String getNomeVendedor() {
        return nomeVendedor;
    }
    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }
    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }
    
}
/*
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
*/