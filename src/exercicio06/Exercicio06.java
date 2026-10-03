package exercicio06;

import java.util.ArrayList;
import java.util.Comparator;

public class Exercicio06 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 28, "111.111.111-11"));
        pessoas.add(new Pessoa("Bruno", 19, "222.222.222-22"));
        pessoas.add(new Pessoa("Carla", 35, "333.333.333-33"));
        pessoas.add(new Pessoa("Diego", 22, "444.444.444-44"));

        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
        System.out.println("Por idade:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }

        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        System.out.print("Por nome: ");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.print(pessoas.get(i).getNome());
            if (i < pessoas.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
