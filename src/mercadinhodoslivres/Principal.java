package mercadinhodoslivres;

//Pacotes-----------------------------
import procinterno.Avaliacao;
import procinterno.FilaAvaliacao;
import procinterno.CadastroUsuario;
import procinterno.Cliente;
import procinterno.CadastroProduto;
import procinterno.Carrinho;
import procinterno.Compra;

import procinterno.Venda;
//-----------------------------------
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal{
        private static List<Cliente> clientes = new ArrayList<>();
        public static void main(String[] args) {
            cadastrarCliente();
            avaliarVendedor();
            FilaAvaliacao();
            FilaAvaliacao filaAvaliacao = new FilaAvaliacao();
            filaAvaliacao.avaliarVendedor();
            filaAvaliacao.avaliarVendedor();
            System.out.println("Avaliações na fila:");
            filaAvaliacao.exibirAvaliacoes();
        }
        public void avaliarVendedor() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o nome do vendedor: ");
            String vendedor = scanner.nextLine();
            System.out.print("Digite a nota do vendedor (0-10): ");
            int nota = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
    
            Avaliacao avaliacao = new Avaliacao(vendedor, nota);
            adicionarAvaliacao(avaliacao);
            System.out.println("Avaliação realizada com sucesso!");
        }
    
        public static void cadastrarCliente() {
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
    
            Cliente cliente = new Cliente(nome, tipo, login, senha, endereco);
            clientes.add(cliente);
            System.out.println("Cliente cadastrado com sucesso!");
        }
    }
    