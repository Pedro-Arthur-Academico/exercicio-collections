package exercicio03;

import java.util.ArrayList;

public class Exercicio03 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("maca");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        int indiceBanana = frutas.indexOf("banana");
        if (indiceBanana != -1) {
            System.out.println("\"banana\" encontrada no indice " + indiceBanana);
        } else {
            System.out.println("\"banana\" nao foi encontrada na lista");
        }

        int indiceUva = frutas.indexOf("uva");
        if (indiceUva != -1) {
            System.out.println("\"uva\" encontrada no indice " + indiceUva);
        } else {
            System.out.println("\"uva\" nao foi encontrada na lista");
        }
    }
}
