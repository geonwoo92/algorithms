package matrixTest;

import java.util.Arrays;

public class Marix1 {
    public static void main(String[] args) {

        int[][] mtx = new int[5][5];
        int k = 1;

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                mtx[4-i][4-j] = k;
                k++;
            }
        }
            for (int i = 0; i < mtx.length; i++) {
                for (int j = 0; j < mtx[i].length; j++) {
                    System.out.print(mtx[i][j] + " ");

                }
                System.out.println();
            }
        }
    }