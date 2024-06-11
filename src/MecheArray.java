import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.Collectors;

        public class MecheArray {
            public static void main(String[] args) {
                List<String> nomes = new ArrayList<>();

                nomes.add("Carlos");
                nomes.add("Joaquim");
                nomes.add("Marcos");
                nomes.add("jessy");
                nomes.add("Ana");

                Stream<String> streamNomes = nomes.stream();

                System.out.println(streamNomes.filter(n ->
                        n.contains("a"+"a")).collect(Collectors.toList()));

            }
        }