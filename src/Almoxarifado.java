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

    public void adicionaUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        System.out.println("Usuario nome " + usuario.getNome() +
                " e login " + usuario.getDadosLogin().getUsuario() + " cadastrado.");
    }

    public Item buscaItem(int id) {
        for (Item item: getItens()) {
            if (item.getId() == id) {
                return item;
            }
        }
        System.out.println("Item id: " + id + " não cadastrado.");
        return null;
    }

    public Usuario buscaUsuario(String login) {
        for (Usuario usuario: getUsuarios()) {
            if (usuario.getDadosLogin().getUsuario().matches(login)) {
                return usuario;
            }
        }
        System.out.println("Login " + login + " não cadastrado.");
        return null;
    }

    public Boolean conferePermissao(String login) {
        Usuario usuario = buscaUsuario(login);
        if (usuario != null) {
            return usuario.getPermissaoAlteracao();
        }
        System.out.println("O usuario não tem permissão.");
        return false;
    }

    public void cadastrarItem(String login, Item item) {
        if (conferePermissao(login)) {
            this.itens.add(item);
            System.out.println("O usuario " + login + " tem permissão e o item " + item.getNome() + " foi cadastrado.");
        }
    }

    public Usuario logar(String login, String senha) {

        for (Usuario usuario: getUsuarios()) {
            if (usuario.getDadosLogin().matches(login, senha)) {
                return usuario;
            }
        }
        return null;
    }

}
