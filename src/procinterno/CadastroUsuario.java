package procinterno;

public class CadastroUsuario {
    private String nomeDoUsuario;
    private String tipoDeUsuario;
    private String loginDoUsuario; 
    private String senhaDoUsuario;
    private String enderecoDoUsuario;

    public CadastroUsuario(String nomeDoUsuario, String tipoDeUsuario, String loginDoUsuario, String senhaDoUsuario, String enderecoDoUsuario) {
        this.nomeDoUsuario = nomeDoUsuario;
        this.tipoDeUsuario = tipoDeUsuario;
        this.loginDoUsuario = loginDoUsuario;
        this.senhaDoUsuario = senhaDoUsuario;
        this.enderecoDoUsuario = enderecoDoUsuario;
    }

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
}

class Nodo {
    CadastroUsuario usuario;
    Nodo anterior;
    Nodo proximo;

    public Nodo(CadastroUsuario usuario) {
        this.usuario = usuario;
        this.anterior = null;
        this.proximo = null;
    }
}

class ListaDuplamenteEncadeada {
    private Nodo inicio;
    private Nodo fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    // Método para adicionar um novo usuário no final da lista
    public void adicionarUsuario(CadastroUsuario usuario) {
        Nodo newNode = new Nodo(usuario);
        if (inicio == null) {
            inicio = newNode;
            fim = newNode;
        } else {
            fim.proximo = newNode;
            newNode.anterior = fim;
            fim = newNode;
        }
    }

    // Método para remover um usuário pelo login
    public void removerUsuario(String loginDoUsuario) {
        Nodo current = inicio;
        while (current != null) {
            if (current.usuario.getLoginDoUsuario().equals(loginDoUsuario)) {
                if (current.anterior != null) {
                    current.anterior.proximo = current.proximo;
                } else {
                    inicio = current.proximo;
                }

                if (current.proximo != null) {
                    current.proximo.anterior = current.anterior;
                } else {
                    fim = current.anterior;
                }
                break;
            }
            current = current.proximo;
        }
    }

    // Método para buscar um usuário pelo login
    public CadastroUsuario buscarUsuario(String loginDoUsuario) {
        Nodo current = inicio;
        while (current != null) {
            if (current.usuario.getLoginDoUsuario().equals(loginDoUsuario)) {
                return current.usuario;
            }
            current = current.proximo;
        }
        return null;
    }

    // Método para exibir todos os usuários
    public void exibirUsuarios() {
        Nodo current = inicio;
        while (current != null) {
            System.out.println("Nome: " + current.usuario.getNomeDoUsuario() + ", Login: " + current.usuario.getLoginDoUsuario());
            current = current.proximo;
        }
    }
}
