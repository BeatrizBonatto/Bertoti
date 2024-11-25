public class Chef {
    private PreparoRefeicao preparoRefeicao;

    public void setPreparoRefeicao(PreparoRefeicao preparoRefeicao) {
        this.preparoRefeicao = preparoRefeicao;
    }

    public void preparar() {
        if (preparoRefeicao != null) {
            preparoRefeicao.preparar();
        } else {
            System.out.println("Nenhuma estratégia de preparo foi definida!");
        }
    }
}
