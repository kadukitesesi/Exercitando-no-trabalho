package com.curiosidades.tempo;

import java.time.LocalTime;

public class Tempo {
    public static void main(String[] args) {
        String horaString = "12:30";
        LocalTime horaLocal = LocalTime.parse(horaString);
        int horaLocalMinutos = horaLocal.toSecondOfDay() / 60;



        System.out.println(horaLocalMinutos);
    }
}
