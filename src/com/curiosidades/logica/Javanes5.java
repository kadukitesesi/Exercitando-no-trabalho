package com.curiosidades.logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Javanes5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> idades = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            System.out.println("Me diga uma idade: ");
            Integer idadeLida = scan.nextInt();
            idades.add(idadeLida);
        }
        AtomicReference<Integer> contaMaiores = new AtomicReference<>(0);

        idades.stream().filter(i -> i >= 18 ).forEach(
                idade -> {
                    contaMaiores.updateAndGet(v -> v + 1);
                }
        );
        System.out.println(contaMaiores);

    }


}
