package _03_memoria_arrays_listas.exercicios.ex01.application;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco"); // adicionando mais um elemento sem prejudicar a lista

        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------------");
        // list.remove(1);
        // list.remove("Alex"); // removendo um elemento à partir de uma comparação
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Bob: " + list.indexOf("Marco"));

        System.out.println("------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }
        System.out.println("------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }

}
