package exercicio07;

import java.util.HashSet;

public class Exercicio07 {
    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<>();
        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(10);
        conjunto.add(30);
        conjunto.add(40);

        System.out.println("Conjunto: " + conjunto);
        System.out.println("Tamanho: " + conjunto.size());
        System.out.println("add(10) retornou: " + conjunto.add(10));
    }
}
