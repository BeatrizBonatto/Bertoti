import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ItemTest {

    // criando almoxarifado com lista de itens e usuários
    Almoxarifado almoxarifado = new Almoxarifado();

    @Test
    public void testItemCadastrado() {

        // criando usuario
        Usuario mateus = new Usuario("Mateus", "Luz",
                new DadosLogin("mateus.luz", "123456"));

        almoxarifado.adicionaUsuario(mateus);

        // alterando permissão
        almoxarifado.buscaUsuario("mateus.luz").setPermissaoAlteracao(true);

        Item caderno = new Item("caderno");

        almoxarifado.cadastrarItem("mateus.luz", caderno);

        // validação quantidade de usuários
        assertEquals(almoxarifado.getItens().size(), 1);

    }

    @Test
    public void testItemNaoCadastrado() {

        // criando usuario
        Usuario mateus = new Usuario("Mateus", "Luz",
                new DadosLogin("mateus.luz", "123456"));

        almoxarifado.adicionaUsuario(mateus);

        Item caderno = new Item("caderno");

        almoxarifado.cadastrarItem("mateus.luz", caderno);

        // validação quantidade de usuários
        assertEquals(almoxarifado.getItens().size(), 0);

    }

    @Test
    public void testIdItemAtual() {

        // criando usuario
        Usuario mateus = new Usuario("Mateus", "Luz",
                new DadosLogin("mateus.luz", "123456"));

        almoxarifado.adicionaUsuario(mateus);

        almoxarifado.buscaUsuario("mateus.luz").setPermissaoAlteracao(true);

        Item caderno = new Item("caderno");

        almoxarifado.cadastrarItem("mateus.luz", caderno);
        almoxarifado.cadastrarItem("mateus.luz", caderno);
        almoxarifado.cadastrarItem("mateus.luz", caderno);
        almoxarifado.cadastrarItem("mateus.luz", caderno);
        almoxarifado.cadastrarItem("mateus.luz", caderno);

        // validação quantidade de usuários
        assertEquals(almoxarifado.getIdItemAtual(), 5);

    }

    @Test
    public void testBuscarItem() {

        // criando usuario
        Usuario mateus = new Usuario("Mateus", "Luz",
                new DadosLogin("mateus.luz", "123456"));

        almoxarifado.adicionaUsuario(mateus);

        almoxarifado.buscaUsuario("mateus.luz").setPermissaoAlteracao(true);

        Item caderno = new Item("caderno");

        almoxarifado.cadastrarItem("mateus.luz", caderno);

        // validação quantidade de usuários
        assertEquals(almoxarifado.buscaItem(1).getNome(), caderno.getNome());

    }

    @Test
    public void testBuscarItemNaoEncontrado() {

        // criando usuario
        Usuario mateus = new Usuario("Mateus", "Luz",
                new DadosLogin("mateus.luz", "123456"));

        almoxarifado.adicionaUsuario(mateus);

        almoxarifado.buscaUsuario("mateus.luz").setPermissaoAlteracao(true);

        Item caderno = new Item("caderno");

        almoxarifado.cadastrarItem("mateus.luz", caderno);

        // validação quantidade de usuários
        assertNull(almoxarifado.buscaItem(2));

    }

}
