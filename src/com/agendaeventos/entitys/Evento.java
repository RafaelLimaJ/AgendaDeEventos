package com.agendaeventos.entitys;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Evento {
    String nome;
    LocalDateTime datahora;
    DiaDaSemana diaDaSemana;



    public Evento(DiaDaSemana diaDaSemana, LocalDateTime datahora, String nome) {
        this.diaDaSemana = diaDaSemana;
        this.datahora = datahora;
        this.nome = nome;
    }
    public void exibirEvento(){
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatada = datahora.format(formatador);
        ZoneId zonaSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId zonaGmt = ZoneId.of("GMT");
        ZonedDateTime dataSaoPaulo = datahora.atZone(zonaSaoPaulo);
        ZonedDateTime dataGmt = dataSaoPaulo.withZoneSameInstant(zonaGmt);
        System.out.println("Lista de eventos");
        System.out.println("Nome: " + nome);
        System.out.println("Data e hora: " + formatada);
        System.out.println("Dia da semana: " + diaDaSemana);
        System.out.println("------------------------");
        System.out.println("Horarios convertidos");
        System.out.println("São Paulo: " + dataSaoPaulo.format(formatador));
        System.out.println("GMT:       " + dataGmt.format(formatador));

    }
}
