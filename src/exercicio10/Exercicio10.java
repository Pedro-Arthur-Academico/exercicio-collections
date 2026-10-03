package exercicio10;

import java.util.TreeSet;

public class Exercicio10 {
    public static void main(String[] args) {
        TreeSet<Integer> conjunto = new TreeSet<>();
        conjunto.add(50);
        conjunto.add(10);
        conjunto.add(30);
        conjunto.add(10);
        conjunto.add(40);
        conjunto.add(20);
        conjunto.add(30);

        System.out.println(conjunto);
        System.out.println("Menor: " + conjunto.first() + " | Maior: " + conjunto.last());
    }
}
