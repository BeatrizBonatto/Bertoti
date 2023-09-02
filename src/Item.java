public class Item {

    //atributos dos itens do almox
    private String nome;
    private int id;
    private int localizacao;
    //private String fornecedor; IMPORTAR

    public Item(String nome, int id, int localizacao) {
        this.nome = nome;
        this.id = id;
        this.localizacao = localizacao;
    }

    //métodos
    public String editLocalizacao () {

    }
        return ("Localização alterada com sucesso");










    //get e sets
    public void setNome(String nomeItem) {
        this.nome = nomeItem;
    }
    public String getNome() {
        return this.nome;
    }

    public void setId(int idItem) {
        this.id = idItem;
    }
    public int getId() {
        return this.id;
    }

    public void setLocalizacao(int localItem) {
        this.localizacao = localItem;
    }
    public int getLocalizacao(){
        return this.localizacao;
    }
}
