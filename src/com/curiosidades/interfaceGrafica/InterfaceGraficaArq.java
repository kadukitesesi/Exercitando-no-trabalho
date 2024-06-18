package com.curiosidades.interfaceGrafica;

import javax.swing.*;
import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class InterfaceGraficaArq {
    public static void main(String[] args) {

    try{
        String continua = JOptionPane.showInputDialog("Quer escrever mais?");
        while(continua.equalsIgnoreCase("sim")){
            JOptionPane.showInputDialog("Quer escrever mais?");
            String nomeDoArquivo = JOptionPane.showInputDialog("DIGA O NOME DO ARQUIVO: ");
            FileOutputStream arquivo = new FileOutputStream(nomeDoArquivo);
            DataOutputStream insercao = new DataOutputStream(arquivo);
            String inserir = JOptionPane.showInputDialog("Escreva o que quer passar para o arquivo");
            insercao.writeChars(inserir);
        }
    } catch (Exception e) {
        System.err.println("Deu ruim");
    }
    }
}
