import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UsuarioTest {

    @Test
    public void testUsuarioAdicionado() {

        // criando almoxarifado com lista de itens e usuários
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando usuario
        Usuario mateus = new Usuario("Mateus", "Luz",
                          new DadosLogin("mateus.luz", "123456"));

        almoxarifado.adicionaUsuario(mateus);

        // validação quantidade de usuários
        assertEquals(almoxarifado.getUsuarios().size(), 1);

    }

    @Test
    public void testUsuarioJaExiste() {

        // criando almoxarifado com lista de itens e usuários
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando usuario
        Usuario mateus = new Usuario("Mateus", "Luz",
                new DadosLogin("mateus.luz", "123456"));

        almoxarifado.adicionaUsuario(mateus);

        almoxarifado.adicionaUsuario(mateus);

        // validação quantidade de usuários
        assertEquals(almoxarifado.getUsuarios().size(), 1);

    }

    @Test
    public void testUsuarioExite() {

        // criando almoxarifado com lista de itens e usuários
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando usuario
        Usuario mateus = new Usuario("Mateus", "Luz",
                new DadosLogin("mateus.luz", "123456"));

        almoxarifado.adicionaUsuario(mateus);

        // validação quantidade de usuários
        assertEquals(almoxarifado.confereSeUsuarioExiste("mateus.luz"), true);

    }

    @Test
    public void testUsuarioNaoExite() {

        // criando almoxarifado com lista de itens e usuários
        Almoxarifado almoxarifado = new Almoxarifado();

        // validação quantidade de usuários
        assertEquals(almoxarifado.confereSeUsuarioExiste("mateus.luz"), false);

    }

    @Test
    public void testUsuarioTemPermissaoAlteracao() {

        // criando almoxarifado com lista de itens e usuários
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando usuario
        Usuario mateus = new Usuario("Mateus", "Luz",
                new DadosLogin("mateus.luz", "123456"));

        almoxarifado.adicionaUsuario(mateus);

        // alterando permissão
        almoxarifado.buscaUsuario("mateus.luz").setPermissaoAlteracao(true);

        // validação quantidade de usuários
        assertEquals(almoxarifado.buscaUsuario("mateus.luz").getPermissaoAlteracao(), true);

    }

    @Test
    public void testUsuarioNaoTemPermissaoAlteracao() {

        // criando almoxarifado com lista de itens e usuários
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando usuario
        Usuario mateus = new Usuario("Mateus", "Luz",
                new DadosLogin("mateus.luz", "123456"));

        almoxarifado.adicionaUsuario(mateus);

        // validação quantidade de usuários
        assertEquals(almoxarifado.buscaUsuario("mateus.luz").getPermissaoAlteracao(), false);

    }

}