import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivos {
    public static void main(String[] args) {




        try{
            FileOutputStream arq = new FileOutputStream("C:\\Users\\User\\user.txt");
            Path path = Paths.get("C:\\Users\\User\\user.txt");

            DataOutputStream gravarArq = new DataOutputStream(arq);

            gravarArq.writeChars("AAAAAA");
            gravarArq.writeChars("Dudu um dia vai trabalhar com Java e dar uma vida melhor pra sua familia");
            arq.close();



            System.out.println(Files.getLastModifiedTime(path));


        } catch (Exception e ) {
            System.err.println("Deu tudo errado!!!!");
        }
    }
}
