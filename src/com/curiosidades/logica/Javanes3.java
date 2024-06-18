package com.curiosidades.logica;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Javanes3 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
         int[][] inteiros = new int[5][4];

        for (int i = 0; i < 5; i++) {
            System.out.println("Leia 4 números para o grupo " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                inteiros[i][j] = ler.nextInt();

            }
        }

        for (int i = 0; i < 5; i++) {
            int[] grupos = inteiros[i];
            System.out.println("Na ordem de leitura do grupo: "
                    + (i + 1 ) + ":" + Arrays.toString(grupos));
            Arrays.sort(grupos);
            System.out.println("Em ordem crescente: " + (i + 1) + Arrays.toString(grupos));
            System.out.println("Na ordem decrescente o grupo " + (i + 1) + " fica: " + Arrays.toString(reverse(grupos)));
        }


    }
    public static int[] reverse(int[] array) {
        return IntStream.rangeClosed(1, array.length)
                .map(i -> array[array.length - i])
                .toArray();
    }
}
