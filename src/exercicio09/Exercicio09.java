package exercicio09;

import java.util.HashSet;

public class Exercicio09 {
    public static void main(String[] args) {
        HashSet<Integer> conjunto = new HashSet<>();
        conjunto.add(5);
        conjunto.add(10);
        conjunto.add(15);
        conjunto.add(20);
        conjunto.add(25);

        if (conjunto.contains(15)) {
            System.out.println("15 esta no conjunto");
        } else {
            System.out.println("15 nao esta no conjunto");
        }

        if (conjunto.contains(18)) {
            System.out.println("18 esta no conjunto");
        } else {
            System.out.println("18 nao esta no conjunto");
        }
    }
}
