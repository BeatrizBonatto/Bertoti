public class DadosLogin {

    private String usuario;
    private String senha;

    public DadosLogin(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // verifica se o login existe e após, se a senha está correta - usado em buscarUsuario e logar
    public Boolean matches(String login, String senha) {
        if (!this.usuario.equals(login)){
            System.out.println("Login não encontrado.");
            return false;
        }
        if (!this.senha.equals(senha)) {
            System.out.println("Senha incorreta.");
            return false;
        }
        return true;

    }

}
