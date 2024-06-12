// Verificar ser Login e Senha fornecidas estão presentes em CadastroUsuario.
package procinterno;

public class Cliente{
    private String nome;
    private String tipo; // "consumidor" ou "vendedor"
    private String login;
    private String senha;
    private String endereco;

    public Cliente(String nome, String tipo, String login, String senha, String endereco) {
        this.nome = nome;
        this.tipo = tipo;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean verificarLogin(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }
}

