package exercicio08;

import java.util.HashSet;
import java.util.Iterator;

public class Exercicio08 {
    public static void main(String[] args) {
        HashSet<String> cidades = new HashSet<>();
        cidades.add("Recife");
        cidades.add("Natal");
        cidades.add("Salvador");
        cidades.add("Fortaleza");
        cidades.add("Sao Luis");

        for (String cidade : cidades) {
            System.out.println(cidade);
        }

        Iterator<String> iterator = cidades.iterator();
        while (iterator.hasNext()) {
            String cidade = iterator.next();
            if (cidade.startsWith("S")) {
                iterator.remove();
            }
        }

        System.out.println("Restantes: " + cidades);
    }
}
