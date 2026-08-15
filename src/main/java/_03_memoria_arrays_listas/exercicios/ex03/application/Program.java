package _03_memoria_arrays_listas.exercicios.ex03.application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i] + "");

        }

        sc.close();

    }
}