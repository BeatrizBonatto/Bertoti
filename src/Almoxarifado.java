import java.util.LinkedList;
import java.util.List;

public class Almoxarifado {
    
    private List<Item> itens;
    private List<Usuario> usuarios;
    private int idItemAtual;
    
    public List<Item> getItens() {
        return itens;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public int getIdItemAtual() {
        return idItemAtual;
    }

    public void setIdItemAtual(Integer idItemAtual) {
        this.idItemAtual = idItemAtual;
    }

    public Almoxarifado() {
        this.itens = new LinkedList<Item>();
        this.usuarios = new LinkedList<Usuario>();
        this.idItemAtual = 0;
    }
    
    // adicionar usuario com nome e login
    public void adicionaUsuario(Usuario usuario) {

        Boolean usuarioJaExiste = confereSeUsuarioExiste(usuario.getDadosLogin().getUsuario());

        if (!usuarioJaExiste) {
            this.usuarios.add(usuario);
            System.out.println("Usuario nome " + usuario.getNome() +
                    " e login " + usuario.getDadosLogin().getUsuario() + " cadastrado.");
        } else {
            System.out.println("Usuario login " + usuario.getDadosLogin().getUsuario() + " já existe.");
        }

    }

    public Boolean confereSeUsuarioExiste(String novoUsuario) {

        Boolean usuarioExiste = false;

        for (Usuario usuario: getUsuarios()) {
            if (usuario.getDadosLogin().getUsuario() == novoUsuario) {
                usuarioExiste = true;
            }
        }

        return usuarioExiste;
    }
    
    // burcar itens pelo id   
    public Item buscaItem(int id) {
        for (Item item: getItens()) {
            if (item.getId() == id) {
                return item;
            }
        }
        System.out.println("Item id: " + id + " não cadastrado.");
        return null;
    }
    
    // burcar usuario pelo login
    public Usuario buscaUsuario(String login) {
        for (Usuario usuario: getUsuarios()) {
            if (usuario.getDadosLogin().getUsuario().matches(login)) {
                return usuario;
            }
        }
        System.out.println("Login " + login + " não cadastrado.");
        return null;
    }
    
    // confere se o usuario possue permissão para cadastrar itens
    public Boolean conferePermissao(String login) {

        Usuario usuario = buscaUsuario(login);

        Boolean permissao = false;

        if (usuario != null) {
            permissao = usuario.getPermissaoAlteracao();
        }

        if (permissao) {
            System.out.println("O usuario tem permissão.");
        } else {
            System.out.println("O usuario não tem permissão.");
        }

        return permissao;
    }

    // se tiver permissão, item é cadastrado, se não retoma o método acima 🔼
    public void cadastrarItem(String login, Item item) {
        if (conferePermissao(login)) {
            int novoId = this.getIdItemAtual() + 1;
            item.setId(novoId);
            this.itens.add(item);
            System.out.println("O item " + item.getNome() + " foi cadastrado.");
            this.setIdItemAtual(novoId);
        }
    }

    // realizar o login do usuario no almoxarifado com login e senha
    public Usuario logar(String login, String senha) {
        for (Usuario usuario: getUsuarios()) {
            if (usuario.getDadosLogin().matches(login, senha)) {
                return usuario;
            }
        }
        return null;
    }

}
