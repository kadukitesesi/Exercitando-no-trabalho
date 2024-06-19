package com.curiosidades.logica;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Javanes4 {

    protected  static class Cliente {
        String nome;
        BigDecimal valorComprado;

        public Cliente(String nome, BigDecimal valorComprado) {
            this.nome = nome;
            this.valorComprado = valorComprado;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public BigDecimal getValorComprado() {
            return valorComprado;
        }

        public void setValorComprado(BigDecimal valorComprado) {
            this.valorComprado = valorComprado;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "nome='" + nome + '\'' +
                    ", valorComprado=" + valorComprado +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<Cliente> clientes = new ArrayList<>();

        System.out.println("Quantos Clientes deseja cadastrar? ");
        int quantidadeClientes = ler.nextInt();
        ler.nextLine();

        for (int i = 0; i < quantidadeClientes; i++) {
            System.out.println("Diga o nome do cliente");
            String nome = ler.nextLine();

            System.out.println("Diga quanto esse cliente gastou durante o ano passado");
            String valorGasto = ler.nextLine();


            BigDecimal bigDecimal = new BigDecimal(valorGasto);

            Cliente cliente = new Cliente(nome, bigDecimal);

            clientes.add(cliente);
        }

        clientes.stream().forEach(
                cliente -> {
                    BigDecimal valorBonus = cliente.getValorComprado().doubleValue() > 1000 ?
                            cliente.getValorComprado().multiply(BigDecimal.valueOf(0.10)) :
                            cliente.getValorComprado().multiply(BigDecimal.valueOf(0.15));

                    System.out.printf("O cliente %s ganhou um bônus de %s%n", cliente.getNome(), valorBonus);
                }
        );


    }
}
