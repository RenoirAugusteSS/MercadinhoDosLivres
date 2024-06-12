package procinterno;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAvaliacao {
    private Queue<Avaliacao> fila;

    public FilaAvaliacao() {
        this.fila = new LinkedList<>();
    }

    // Método para adicionar uma nova avaliação na fila
    public void adicionarAvaliacao(Avaliacao avaliacao) {
        fila.add(avaliacao);
    }

    // Método para remover a próxima avaliação da fila
    public Avaliacao removerAvaliacao() {
        return fila.poll();
    }

    // Método para exibir todas as avaliações na fila
    public void exibirAvaliacoes() {
        for (Avaliacao avaliacao : fila) {
            System.out.println("Nome do Vendedor: " + avaliacao.getNomeVendedor() + ", Nota: " + avaliacao.getNotaAvaliacao());
        }
    }

}

