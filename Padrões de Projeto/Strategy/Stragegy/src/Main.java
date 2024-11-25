public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();

        // O chef decide preparar uma salada
        chef.setPreparoRefeicao(new PrepararSalada());
        chef.preparar();

        // O chef decide preparar uma sopa
        chef.setPreparoRefeicao(new PrepararSopa());
        chef.preparar();

        // O chef decide preparar uma sobremesa
        chef.setPreparoRefeicao(new PrepararSobremesa());
        chef.preparar();
    }
}
