package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'.','.','.','.','5','.','.','1','.'},
                {'.','4','.','3','.','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','1'},
                {'8','.','.','.','.','.','.','2','.'},
                {'.','.','2','.','7','.','.','.','.'},
                {'.','1','5','.','.','.','.','.','.'},
                {'.','.','.','.','.','2','.','.','.'},
                {'.','2','.','9','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'}};

        boolean result = isValidSudoku(board);
        System.out.println(result);
    }

    private static boolean isValidSudoku(char[][] board) {
        Set<Character> charSet = new HashSet<Character>();
        // Checking each row
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!charSet.contains(board[i][j]) || board[i][j] == '.') {
                    charSet.add(board[i][j]);
                }
                else return false;
            }
            charSet.clear();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!charSet.contains(board[j][i]) || board[j][i] == '.') {
                    charSet.add(board[j][i]);
                }
                else return false;
            }
            charSet.clear();
        }

        for (int l = 0; l < 3; l++) {
            for (int i = 0; i < 3; i++) {
                for (int j = 3*l; j < 3 + 3*l; j++) {
                    for (int k = 3*i; k < 3 + 3*i; k++) {
                        if (!charSet.contains(board[j][k]) || board[j][k] == '.') {
                            charSet.add(board[j][k]);
                        }
                        else return false;
                    }
                }
                charSet.clear();
            }
        }


        return true;
    }
}
