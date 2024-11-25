class PrepararSalada implements PreparoRefeicao {
    @Override
    public void preparar() {
        System.out.println("""
                Preparando uma salada:\s
                - Lavando;\s
                - Cortando;\s
                - Misturando os ingredientes...

                - Prato pronto!""");
    }
}
