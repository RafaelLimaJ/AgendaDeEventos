import com.agendaeventos.entitys.DiaDaSemana;
import com.agendaeventos.entitys.Evento;

import java.time.LocalDateTime;

void main() {

    LocalDateTime dataAtual = LocalDateTime.now();
    LocalDateTime dataEvento = dataAtual.plusDays(5);
    DiaDaSemana diaDaSemana = DiaDaSemana.TERCA;
    String nome = "Festa de aniversario";


    Evento evento = new Evento(diaDaSemana, dataEvento, nome);
    evento.exibirEvento();


}
