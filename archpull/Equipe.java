import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Usuario> Integrantes;

    public Equipe(String nome) {
        this.nome = nome;
        this.Integrantes = new ArrayList<>();
    }

    public void adicionarMembro(Usuario usuario) {
        Integrantes.add(usuario);
    }

    public String getNome() {
        return nome;
    }

    public List<Usuario> getIntegrantes() {
        return Integrantes;
    }

    @Override
    public String toString() {
        return "Equipe: " + nome + ", Membros: " + Integrantes;
    }
}