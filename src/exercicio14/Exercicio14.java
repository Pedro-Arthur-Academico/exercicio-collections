package exercicio14;

import java.util.HashMap;
import java.util.Map;

public class Exercicio14 {
    public static void main(String[] args) {
        HashMap<String, Pessoa> mapa = new HashMap<>();
        mapa.put("111.111.111-11", new Pessoa("Ana", 28, "111.111.111-11"));
        mapa.put("222.222.222-22", new Pessoa("Bruno", 19, "222.222.222-22"));
        mapa.put("333.333.333-33", new Pessoa("Carla", 35, "333.333.333-33"));

        for (Map.Entry<String, Pessoa> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Pessoa busca = mapa.get("222.222.222-22");
        System.out.println("Busca: " + busca);

        Pessoa antiga = mapa.put("222.222.222-22", new Pessoa("Bruna", 20, "222.222.222-22"));
        System.out.println("Put retornou: " + antiga);
        System.out.println("Tamanho do mapa: " + mapa.size());
    }
}
