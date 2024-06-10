package procinterno;

public class CadastroUsuario{
    private String nomeDoUsuario;
    private String tipoDeUsuario; // "consumidor" ou "vendedor"
    private String loginDoUsuario; 
    private String senhaDoUsuario;
    private String enderecoDoUsuario;

    public String getNomeDoUsuario() {
        return nomeDoUsuario;
    }

    public void setNomeDoUsuario(String nomeDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String getLoginDoUsuario() {
        return loginDoUsuario;
    }

    public void setLoginDoUsuario(String loginDoUsuario) {
        this.loginDoUsuario = loginDoUsuario;
    }

    public String getSenhaDoUsuario() {
        return senhaDoUsuario;
    }

    public void setSenhaDoUsuario(String senhaDoUsuario) {
        this.senhaDoUsuario = senhaDoUsuario;
    }

    public String getEnderecoDoUsuario() {
        return enderecoDoUsuario;
    }
    
    public void setEnderecoDoUsuario(String enderecoDoUsuario) {
        this.enderecoDoUsuario = enderecoDoUsuario;
    }

    
/* 
    public Cadastro(String nomeDoUsuario, String tipoDeUsuario, String loginDoUsuario, String senhaDoUsuario, String endereco) {
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
*/