package exercicio16;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Exercicio16 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Carla");
        nomes.add("Bruno");
        nomes.add("Diego");

        List<String> semDuplicatas = new ArrayList<>(new LinkedHashSet<>(nomes));
        System.out.println(semDuplicatas);
    }
}
