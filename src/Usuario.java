public class Usuario {
    private int id;
    private String nome;
    private Setor setor;

    public Usuario(int id, String nome, Setor setor) {
        this.id = id;
        this.nome = nome;
        this.setor = setor;
    }

    public void setId(int idUsuario) {
        this.id = idUsuario;
    }
    public int getId() {
        return this.id;
    }

    public void setNome(String nomeUsuario) {
        this.nome = nomeUsuario;
    }
    public String getNome() {
        return this.nome;
    }

    public void setSetor(Setor setorUsuario) {
        this.setor = setorUsuario;
    }

    public Setor getSetor() {
        return setor;
    }
}
