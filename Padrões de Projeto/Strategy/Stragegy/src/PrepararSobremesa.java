public class PrepararSobremesa implements PreparoRefeicao {
    @Override
    public void preparar() {
        System.out.println("""
                Preparando uma sobremesa:\s
                - Batendo creme;\s
                - Montando uma torta;\s
                - Refrigerando...

                - Prato pronto!""");
    }
}
