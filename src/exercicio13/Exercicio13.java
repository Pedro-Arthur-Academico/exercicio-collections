package exercicio13;

import java.util.TreeMap;
import java.util.Map;

public class Exercicio13 {
    public static void main(String[] args) {
        TreeMap<String, Integer> pessoas = new TreeMap<>();
        pessoas.put("Rafael", 33);
        pessoas.put("Beatriz", 27);
        pessoas.put("Lucas", 19);
        pessoas.put("Amanda", 45);
        pessoas.put("Gustavo", 22);

        for (Map.Entry<String, Integer> entry : pessoas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Primeira: " + pessoas.firstKey() + " | Ultima: " + pessoas.lastKey());
    }
}
