package com.atguigu.sparsearray;

public class SparseArray {

    public static void main(String[] args) {
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        System.out.println("原始的二维数组");
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("sum=" + sum);
        int sparesArray[][] = new int[sum + 1][3];
        sparesArray[0][0] = 11;
        sparesArray[0][1] = 11;
        sparesArray[0][2] = sum;
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparesArray[count][0] = i;
                    sparesArray[count][1] = j;
                    sparesArray[count][2] = chessArr1[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("得到的稀疏数组为~~~~");
        for (int i = 0; i < sparesArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparesArray[i][0], sparesArray[i][1], sparesArray[i][2]);
        }
        int chessArr2[][] = new int[sparesArray[0][0]][sparesArray[0][1]];
        for (int i = 1; i < sparesArray.length; i++) {
            chessArr2[sparesArray[i][0]][sparesArray[i][1]] = sparesArray[i][2];
        }

        System.out.println();
        System.out.println("恢复后的二维数组");
        for (int[] row : chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
