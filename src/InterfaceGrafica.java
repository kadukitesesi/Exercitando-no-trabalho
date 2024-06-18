import javax.swing.*;

public class InterfaceGrafica {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual seu nome");
        String sobrenome = JOptionPane.showInputDialog("Qual seu sobrenome");

        String nomeCompleto = nome + " " + sobrenome;

        JOptionPane.showMessageDialog(null, "Nome Completo: "+nomeCompleto,"Informação",JOptionPane.INFORMATION_MESSAGE);

    }
}
