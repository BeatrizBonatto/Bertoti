import java.util.LinkedList;
import java.util.List;

public class Almoxarifado {
    
    private List<Item> itens;
    private List<Usuario> usuarios;
    
    public List<Item> getItens() {
        return itens;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Almoxarifado() {
        this.itens = new LinkedList<Item>();
        this.usuarios = new LinkedList<Usuario>();
    }
    
    // adicionar usuario com nome e login
    public void adicionaUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        System.out.println("Usuario nome " + usuario.getNome() +
                " e login " + usuario.getDadosLogin().getUsuario() + " cadastrado.");
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
        if (usuario != null) {
            return usuario.getPermissaoAlteracao();
        }
        System.out.println("O usuario não tem permissão.");
        return false;
    }
    
    // se tiver permissão, item é cadastrado, se não retoma o método acima 🔼
    public void cadastrarItem(String login, Item item) {
        if (conferePermissao(login)) {
            this.itens.add(item);
            System.out.println("O usuario " + login + " tem permissão e o item " + item.getNome() + " foi cadastrado.");
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
