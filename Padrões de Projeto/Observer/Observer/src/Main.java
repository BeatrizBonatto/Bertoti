public class Main {
    public static void main(String[] args) {
        GrupoWhatsApp grupo = new GrupoWhatsApp();

        Participante beatriz = new Participante("Beatriz");
        Participante mateus = new Participante("Mateus");

        grupo.adicionarParticipante(beatriz);
        grupo.adicionarParticipante(mateus);

        grupo.enviarMensagem("Olá, turma! Nós teremos uma prova às 15h amanhã.");
        grupo.enviarMensagem("Por favor, não esqueçam de trazer os materiais");

        grupo.removerParticipante(beatriz);
        grupo.enviarMensagem("Beatriz saiu do grupo...");
    }
}




