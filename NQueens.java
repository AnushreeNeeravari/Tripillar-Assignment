package com.basics.tripillarAssignmentThree;

public class NQueens {
    public static boolean solve(int[][] board, int col) {
        if (col >= 4) {
            printBoard(board);
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                solve(board, col + 1);
                board[i][col] = 0;
            }
        }
        return false;
    }
    // (Helper methods isSafe and printBoard would be included here)
    private static boolean isSafe(int[][] board, int row, int col){
        for (int i =0; i<col; i ++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (int i = row, j =col; i>=0 && j>=0; i--,j--) {
            if (board[i][j] == 1) {
                    return false;
            }
        }
        for (int i = row, j = col; j>=0 && i<4 ; i++,j--){
                            return false;
        }
        return true;
    }
    private static void printBoard(int[][] board){
        System.out.println("----- Solution Found-------");
        for (int[] row:board){
            for (int cell: row){
                System.out.println(cell == 1? " Q " : " . ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] board = new int[4][4];
        System.out.println(solve(board,0));
    }

}

