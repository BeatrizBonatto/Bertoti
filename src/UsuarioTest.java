import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {

    // criando almoxarifado com lista de itens e usuários
    Almoxarifado almoxarifado = new Almoxarifado();

    @Test
    public void testUsuarioAdicionado() {

        // criando usuario
        Usuario Beatriz = new Usuario("Beatriz", "Akemi",
                          new DadosLogin("beatriz.akemi", "123456"));

        almoxarifado.adicionaUsuario(Beatriz);

        // validação quantidade de usuários
        assertEquals(almoxarifado.getUsuarios().size(), 1);

    }

    @Test
    public void testUsuarioJaExiste() {

        // criando almoxarifado com lista de itens e usuários
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando usuario
        Usuario Beatriz = new Usuario("Beatriz", "Akemi",
                new DadosLogin("beatriz.akemi", "123456"));

        almoxarifado.adicionaUsuario(Beatriz);

        almoxarifado.adicionaUsuario(Beatriz);

        // validação quantidade de usuários
        assertEquals(almoxarifado.getUsuarios().size(), 1);

    }

    @Test
    public void testUsuarioExite() {

        // criando usuario
        Usuario Beatriz = new Usuario("Beatriz", "Akemi",
                new DadosLogin("beatriz.akemi", "123456"));

        almoxarifado.adicionaUsuario(Beatriz);

        // validação quantidade de usuários
        assertEquals(almoxarifado.confereSeUsuarioExiste("beatriz.akemi"), true);

    }

    @Test
    public void testUsuarioNaoExite() {

        // validação quantidade de usuários
        assertEquals(almoxarifado.confereSeUsuarioExiste("beatriz.akemi"), false);

    }

    @Test
    public void testUsuarioTemPermissaoAlteracao() {

        // criando usuario
        Usuario Beatriz = new Usuario("Beatriz", "Akemi",
                new DadosLogin("beatriz.akemi", "123456"));

        almoxarifado.adicionaUsuario(Beatriz);

        // alterando permissão
        almoxarifado.buscaUsuario("beatriz.akemi").setPermissaoAlteracao(true);

        // validação quantidade de usuários
        assertEquals(almoxarifado.buscaUsuario("beatriz.akemi").getPermissaoAlteracao(), true);

    }

    @Test
    public void testUsuarioNaoTemPermissaoAlteracao() {

        // criando usuario
        Usuario Beatriz = new Usuario("Beatriz", "Akemi",
                new DadosLogin("beatriz.akemi", "123456"));

        almoxarifado.adicionaUsuario(Beatriz);

        // validação quantidade de usuários
        assertEquals(almoxarifado.buscaUsuario("beatriz.akemi").getPermissaoAlteracao(), false);

    }

}