public class Usuario {

    private String nome;
    private String sobrenome;
    private DadosLogin dadosLogin;
    private Boolean permissaoAlteracao;

    public Usuario(String nome, String sobrenome, DadosLogin dadosLogin) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dadosLogin = dadosLogin;
        // o usuario será criado sem permissao de alterar itens no almoxarifado porem podera consultar os itens
        this.permissaoAlteracao = false;
    }

    public void setNome(String nomeUsuario) {
        this.nome = nomeUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public DadosLogin getDadosLogin() {
        return dadosLogin;
    }

    public void setDadosLogin(DadosLogin dadosLogin) {
        this.dadosLogin = dadosLogin;
    }

    public Boolean getPermissaoAlteracao() {
        return permissaoAlteracao;
    }

    public void setPermissaoAlteracao(Boolean permissaoAlteracao) {
        this.permissaoAlteracao = permissaoAlteracao;
    }

}
