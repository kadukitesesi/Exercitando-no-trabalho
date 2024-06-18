package com.curiosidades.tempo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTreino {
    public static void main(String[] args) {
        Timer timer = new Timer();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                LocalDateTime horas = LocalDateTime.now();
                String horasFormatadas = horas.format(formatter);
                System.out.println("Executando em: "+ horasFormatadas);
            }
        }, 1000,6000);
    }
}
