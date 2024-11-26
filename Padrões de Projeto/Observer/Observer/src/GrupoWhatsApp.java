import java.util.ArrayList;
import java.util.List;

public class GrupoWhatsApp {
    private List<Observador> participantes = new ArrayList<>();

    public void adicionarParticipante(Observador participante) {
        participantes.add(participante);
    }

    public void removerParticipante(Observador participante) {
        participantes.remove(participante);
    }

    public void enviarMensagem(String mensagem) {
        for (Observador participante : participantes) {
            participante.receberMensagem(mensagem);
        }
    }
}