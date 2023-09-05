public class Fornecedor {
    //atributos
    private int id;
    private String nome;

    public Fornecedor(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    //get e set
    public void setId(int idFornecedor) {
        this.id = idFornecedor;
    }
    public int getId() {
        return this.id;
    }

    public void setNome(String nomeFornecedor) {
        this.nome = nomeFornecedor;
    }
    public String getNome() {
        return this.nome;
    }
}
