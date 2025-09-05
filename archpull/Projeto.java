public class Projeto {
    private String nome;
    private Equipe equipe;

    public Projeto(String nome) {
        this.nome = nome;
        this.equipe = null;
    }

    public void alocarEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public String getNome() {
        return nome;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + ", Equipe: " + (equipe != null ? equipe.getNome() : "Nenhuma equipe alocada");
    }
}//criar o sistema que aloca os usuarios as equipes e as equipes aos projetos.