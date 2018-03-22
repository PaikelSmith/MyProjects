package Lab3;

import java.util.Random;


class Matrix {
    private int n,m;
    private boolean[][] firstMatrix, secondMatrix;

    Matrix(int nSize, int mSize) {
        n = nSize;
        m = mSize;
        firstMatrix = new boolean[n][m];
        secondMatrix = new boolean[n][m];
    }

    private void fillMatrixByRandom(boolean[][] matrix) { // Заполнение матрицы
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextBoolean();
            }
        }
    }

    private void printMatrix(boolean[][] matrix, String name) { // Печать матрицы
        System.out.println(name);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print((matrix[i][j] ? 1 : 0) + "\t");
            }
            System.out.println();
        }
    }

    private void inverseMatrix(boolean[][] matrix) { // Инверсия матрицы (отрицание)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = !matrix[i][j];
            }
        }
        System.out.println();
    }

    private boolean[][] foldMatrix(boolean[][] matrix ,boolean[][] foldedMatrix) { // Сложение матрицы
        boolean[][] foldResult = new boolean[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                foldResult[i][j] = matrix[i][j] | foldedMatrix[i][j];
            }
        }
        System.out.println();
        return foldResult;
    }

    private boolean[][] multyMatrix(boolean[][] matrix ,boolean[][] foldedMatrix) { // Сложение матрицы
        boolean[][] foldResult = new boolean[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                foldResult[i][j] = matrix[i][j] & foldedMatrix[i][j];
            }
        }
        System.out.println();
        return foldResult;
    }

    private void odinMatrix(boolean[][] matrix, String name){ // Подсчёт единиц матрицы
        System.out.print(name + " ");
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j]) count++;
            }
        }
        System.out.println(count);
    }

    void run() {
        fillMatrixByRandom(firstMatrix);
        printMatrix(firstMatrix, "Первая матрица");
        fillMatrixByRandom(secondMatrix);
        printMatrix(secondMatrix, "Вторая матрица");
        inverseMatrix(firstMatrix);
        printMatrix(firstMatrix, "Первая матрица после инверсии");
        inverseMatrix(secondMatrix);
        printMatrix(secondMatrix, "Вторая матрица после инверсии");
        printMatrix(foldMatrix(firstMatrix,secondMatrix), "Результат сложения двух инвертированных матриц");
        printMatrix(multyMatrix(firstMatrix,secondMatrix), "Результат умножения двух инвертированных матриц");
        inverseMatrix(firstMatrix);
        odinMatrix(firstMatrix, "Количество единиц первой матрицы");
        inverseMatrix(secondMatrix);
        odinMatrix(secondMatrix, "Количество единиц второй матрицы");
    }

}

public class BooleanMatrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2,2);
        matrix.run();
    }

}
