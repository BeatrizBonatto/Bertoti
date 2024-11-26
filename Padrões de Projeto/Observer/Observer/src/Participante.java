public class Participante implements Observador {
    private String nome;

    public Participante(String nome) {
        this.nome = nome;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}
