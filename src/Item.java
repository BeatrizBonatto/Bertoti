public class Item {

    private int id;
    private String nome;

    public Item(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    //get e sets
    public void setId(int idItem) {
        this.id = idItem;
    }

    public int getId() {
        return this.id;
    }

    public void setNome(String nomeItem) {
        this.nome = nomeItem;
    }

    public String getNome() {
        return this.nome;
    }

}
