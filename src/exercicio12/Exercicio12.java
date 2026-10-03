package exercicio12;

import java.util.HashMap;

public class Exercicio12 {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Joao", 30);
        pessoas.put("Maria", 25);
        pessoas.put("Pedro", 41);

        if (pessoas.containsKey("Joao")) {
            System.out.println("Joao tem " + pessoas.get("Joao") + " anos");
        }

        if (pessoas.containsKey("Ana")) {
            System.out.println("Ana tem " + pessoas.get("Ana") + " anos");
        } else {
            System.out.println("Ana nao esta cadastrada");
        }
    }
}
