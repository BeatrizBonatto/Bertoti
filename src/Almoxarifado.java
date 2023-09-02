import java.util.LinkedList;
import java.util.List;

public class Almoxarifado {
    private List<Item> item = new LinkedList<Item>();
    private List<Usuario> usuario = new LinkedList<Usuario>();

    public void addItem(Item item){

        item.add(item);
    }
    public void addUsuario(Usuario usuario) {
        usuario.add(usuario);
    }
    public List<Item>bucarItemNome(String nome);

    List<Item> encontados = new LinkedList<Item>();
    //for(Item item: itens) {
   //     if(item.getNome()equals(nomeItem) encontrados.add(item));
    }
   // return encontrados;
}


//uma lista vazia existe
//uma lista nula não existe