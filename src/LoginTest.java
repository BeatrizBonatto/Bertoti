import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LoginTest {

    @Test
    public void testUsuarioValidoESenhaValida() {

        // criando Almoxerifado
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando Usuario
        Usuario beatriz = new Usuario("Beatriz", "Bonatto",
                new DadosLogin("biakemi", "123"));

        // cadastrando Usuario
        almoxarifado.adicionaUsuario(beatriz);

        // criando usuário para receber a resposta do método logar
        Usuario usuario;

        // retorno da tentativa de login
        usuario = almoxarifado.logar("biakemi", "123");

        // validação login realizado
        assertEquals(beatriz, usuario);

    }

    @Test
    public void testUsuarioValidoESenhaInvalida() {

        // criando Almoxerifado
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando Usuario
        Usuario beatriz = new Usuario("Beatriz", "Bonatto",
                new DadosLogin("biakemi", "123"));

        // criando usuário para receber a resposta do método logar
        Usuario usuario;

        // retorno da tentativa de login
        usuario = almoxarifado.logar("biakemi", "456");

        // validação login realizado
        assertNotEquals(beatriz, usuario);

    }

    @Test
    public void testUsuarioInvalidoESenhaValida() {

        // criando Almoxerifado
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando Usuario
        Usuario beatriz = new Usuario("Beatriz", "Bonatto",
                new DadosLogin("biakemi", "123"));

        // cadastrando Usuario
        almoxarifado.adicionaUsuario(beatriz);

        // criando usuário para receber a resposta do método logar
        Usuario usuario;

        // retorno da tentativa de login
        // não existe senha válida para um usuário inválido
        usuario = almoxarifado.logar("gabi", "123");

        // validação login realizado
        assertNotEquals(beatriz, usuario);

    }

    @Test
    public void testUsuarioInvalidoESenhaInvalida() {

        // criando Almoxerifado
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando Usuario
        Usuario beatriz = new Usuario("Beatriz", "Bonatto",
                new DadosLogin("biakemi", "123"));

        // cadastrando Usuario
        almoxarifado.adicionaUsuario(beatriz);

        // criando usuário para receber a resposta do método logar
        Usuario usuario;

        // retorno da tentativa de login
        // não existe senha válida para um usuário inválido
        usuario = almoxarifado.logar("gabi", "456");

        // validação login realizado
        assertNotEquals(beatriz, usuario);

    }

}
