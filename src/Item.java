public class Item {
    //atributos dos itens do almox
    private int id;
    private String nome;
    private Fornecedor fornecedor;
    private int localizacao;

    //parâmetro construtor
    public Item(int id, String nome,Fornecedor fornecedor, int localizacao) {
        this.id = id;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.localizacao = localizacao;
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

    public void setFornecedor(Fornecedor fornecedorItem) {
        this.fornecedor = fornecedorItem;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setLocalizacao(int localItem) {
        this.localizacao = localItem;
    }
    public int getLocalizacao(){
        return this.localizacao;
    }
}
