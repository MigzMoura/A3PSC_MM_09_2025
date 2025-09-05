public class Usuario {
    private String nome;
    private String login;

    public Usuario(String nome, String login) {
        this.nome = nome;
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return nome + " (" + login + ")"
    }
}