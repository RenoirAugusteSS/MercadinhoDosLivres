package procinterno;

public class Avaliacao {
    private String nomeVendedor;
    private int notaAvaliacao;

    public Avaliacao(String nomeVendedor, int notaAvaliacao) {
        this.nomeVendedor = nomeVendedor;
        this.notaAvaliacao = notaAvaliacao;
    }

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
