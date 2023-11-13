import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ItemTest {

    // criando almoxarifado com lista de itens e usuários
    Almoxarifado almoxarifado = new Almoxarifado();

    @Test
    public void testItemCadastrado() {

        // criando usuario
        Usuario Beatriz = new Usuario("Beatriz", "Akemi",
                new DadosLogin("beatriz.akemi", "123456"));

        almoxarifado.adicionaUsuario(Beatriz);

        // alterando permissão
        almoxarifado.buscaUsuario("beatriz.akemi").setPermissaoAlteracao(true);

        Item caderno = new Item("caderno");

        almoxarifado.cadastrarItem("beatriz.akemi", caderno);

        // validação quantidade de usuários
        assertEquals(almoxarifado.getItens().size(), 1);

    }

    @Test
    public void testItemNaoCadastrado() {

        // criando usuario
        Usuario Beatriz = new Usuario("Beatriz", "Akemi",
                new DadosLogin("beatriz.akemi", "123456"));

        almoxarifado.adicionaUsuario(Beatriz);

        Item caderno = new Item("caderno");

        almoxarifado.cadastrarItem("beatriz.akemi", caderno);

        // validação quantidade de usuários
        assertEquals(almoxarifado.getItens().size(), 0);

    }

    @Test
    public void testIdItemAtual() {

        // criando usuario
        Usuario Beatriz = new Usuario("Beatriz", "Akemi",
                new DadosLogin("beatriz.akemi", "123456"));

        almoxarifado.adicionaUsuario(Beatriz);

        almoxarifado.buscaUsuario("beatriz.akemi").setPermissaoAlteracao(true);

        Item caderno = new Item("caderno");

        almoxarifado.cadastrarItem("beatriz.akemi", caderno);
        almoxarifado.cadastrarItem("beatriz.akemi", caderno);
        almoxarifado.cadastrarItem("beatriz.akemi", caderno);
        almoxarifado.cadastrarItem("beatriz.akemi", caderno);
        almoxarifado.cadastrarItem("beatriz.akemi", caderno);

        // validação quantidade de usuários
        assertEquals(almoxarifado.getIdItemAtual(), 5);

    }

    @Test
    public void testBuscarItem() {

        // criando usuario
        Usuario Beatriz = new Usuario("Beatriz", "Akemi",
                new DadosLogin("beatriz.akemi", "123456"));

        almoxarifado.adicionaUsuario(Beatriz);

        almoxarifado.buscaUsuario("beatriz.akemi").setPermissaoAlteracao(true);

        Item caderno = new Item("caderno");

        almoxarifado.cadastrarItem("beatriz.akemi", caderno);

        // validação quantidade de usuários
        assertEquals(almoxarifado.buscaItem(1).getNome(), caderno.getNome());

    }

    @Test
    public void testBuscarItemNaoEncontrado() {

        // criando usuario
        Usuario Beatriz = new Usuario("Beatriz", "Akemi",
                new DadosLogin("beatriz.akemi", "123456"));

        almoxarifado.adicionaUsuario(Beatriz);

        almoxarifado.buscaUsuario("beatriz.akemi").setPermissaoAlteracao(true);

        Item caderno = new Item("caderno");

        almoxarifado.cadastrarItem("beatriz.akemi", caderno);

        // validação quantidade de usuários
        assertNull(almoxarifado.buscaItem(2));

    }

}
