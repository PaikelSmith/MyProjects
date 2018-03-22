package Package;

import java.util.Scanner;
import static java.lang.Math.random;
import static java.lang.Math.round;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность матрицы: ");
        int n = in.nextInt();
        double[][] mas = new double[n][n];
        for (int i = 0; i < mas.length; i++)
            for (int j = 0; j < mas[i].length; j++)
                mas[i][j] = -n + random()*n*2;

        System.out.println("Полученная матрица:");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++)
                System.out.print(mas[i][j] + "\t");
            System.out.println("");
        }

        int[][] c = new int[n][n];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                c[i][j] = (int) round(mas[i][j]);
            }
        }

        System.out.println("Округлённая матрица:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++)
                System.out.print(c[i][j] + " ");
            System.out.println("");
        }
    }
}

