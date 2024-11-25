public class PrepararSopa implements PreparoRefeicao {
    @Override
    public void preparar() {
        System.out.println("""
                Preparando uma sopa:\s
                - Cozinhando legumes;\s
                - Adicionando temperos;\s
                - Misturando os ingredientes...

                - Prato pronto!""");
    }
}