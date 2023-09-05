public class Setor {
    //atributos
    private int id;
    private String nome;

    //parâmetro construtor
    public Setor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //get e set
    public void getId(int idSetor) {
        this.id = idSetor;
    }
    public int setId() {
        return this.id;
    }

    public void getNome(String nomeSetor) {
        this.nome = nomeSetor;
    }
    public String setNome() {
        return this.nome;
    }
}
