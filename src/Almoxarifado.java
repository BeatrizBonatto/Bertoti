import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Almoxarifado {
    private static List<Item> item = new LinkedList<Item>();
    private List<Fornecedor> fornecedor = new LinkedList<Fornecedor>();
    private List<Usuario> usuario = new LinkedList<Usuario>();
    private List<Setor> setor = new LinkedList<Setor>();

    //add item ao almoxarifado
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (true){
            System.out.println("ADICIONAR ITEM");
            System.out.println("--------------------------------");
            System.out.println("Digite as informações do item ");
            System.out.println("Nome: ");
            String nomeItem = sc.next();
            System.out.println("Fornecedor: ");
            String fornecedorItem = sc.next();
            System.out.println("Localização: ");
            int localizacaoItem = sc.nextInt();

            Item item1 = new Item((x+1), nomeItem, fornecedorItem,localizacaoItem);

            if (item.isEmpty()) {
                break;
            }
            item.add(item1);
            System.out.println(item1);
        }
        sc.close();
    }

    //add Usuario
    //buscar Item pelo Nome
    //buscar Item pelo Id
    //buscar Requisicao do Usuario
    //buscar Requisicao pelo ID
    //bucar Fornecedor pelo Nome
    //buscar Fornecedor pelo Id
}

//uma lista vazia existe
//uma lista nula não existe