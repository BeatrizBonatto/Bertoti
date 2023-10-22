import java.util.List;

public class Main {

    public static void main(String[] args) {

        // criando Almoxerifado
        Almoxarifado almoxarifado = new Almoxarifado();

        // criando Usuario
        Usuario beatriz = new Usuario("Beatriz", "Bonatto",
                            new DadosLogin("biakemi", "123"));

        // cadastrando Usuario
        almoxarifado.adicionaUsuario(beatriz);

        // tentando logar com usuário inexistente
        Usuario usuarioInexistente = almoxarifado.logar("gabiayumi", "123");

        // tentando logar com senha incorreta
        Usuario usuarioSenhaIncorreta = almoxarifado.logar("biakemi", "456");

        // tentando logar com usuário cadastrado
        Usuario usuario = almoxarifado.logar("biakemi", "123");

        if(usuario != null) {

            // criando Item
            Item celular = new Item(1, "Samsung");

            // tentando cadastrar item | erro usuário não encontrado
            almoxarifado.cadastrarItem("bea", celular);

            // tentando cadastrar item | erro permissão
            almoxarifado.cadastrarItem("biakemi", celular);

            // alterando permissão
            almoxarifado.buscaUsuario("biakemi").setPermissaoAlteracao(true);

            // tentando cadastrar item | item cadastrado
            almoxarifado.cadastrarItem("biakemi", celular);

            // buscando item
            almoxarifado.buscaItem(1);
        }

    }

}
