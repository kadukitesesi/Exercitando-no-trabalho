package com.curiosidades.logica;

import java.util.stream.IntStream;

public class javanes2 {
    public static void main(String[] args) {
                IntStream.rangeClosed(92, 1478)
                        .filter(n -> isPrime(n))
                        .forEach(System.out::println);
            }

            public static boolean isPrime(int number) {
                if (number < 2) {
                    return false;
                }

                return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                        .allMatch(divisor -> number % divisor != 0);
            }
        }
