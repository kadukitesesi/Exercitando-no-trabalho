package com.curiosidades.logica;

import java.util.stream.IntStream;


public class Stream01 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1000,2000).filter(
                n-> n % 11 == 5
        ).forEach(System.out::println);




    }
}
