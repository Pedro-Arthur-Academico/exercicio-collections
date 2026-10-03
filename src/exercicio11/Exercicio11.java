package exercicio11;

import java.util.HashMap;
import java.util.Map;

public class Exercicio11 {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Joao", 30);
        pessoas.put("Maria", 25);
        pessoas.put("Pedro", 41);

        for (Map.Entry<String, Integer> entry : pessoas.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos");
        }
    }
}
