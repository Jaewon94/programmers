import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[][] clone = new int[board.length][board.length];
        
        for (int i=0; i<board.length; i++) {
            for (int j=0;j<board.length; j++) {
                clone[i][j] = board[i][j];
            }
        }
        
        for (int i=0; i<clone.length; i++) {
            for (int j=0; j<clone[i].length; j++) {
                if (clone[i][j] != 0) {
                    if (j > 0) {
                        board[i][j-1]++;
                    }
                    if (j < clone[i].length -1) {
                        board[i][j+1]++;
                    }
                    if (i < clone.length -1) {
                        if (j > 0) {
                            board[i+1][j-1]++;
                        }
                        if (j < clone[i].length-1) {
                            board[i+1][j+1]++;
                        }
                        board[i+1][j]++;
                    }
                    if (i > 0) {
                        if (j > 0) {
                            board[i-1][j-1]++;
                        } 
                        if (j < clone[i].length -1) {
                            board[i-1][j+1]++;

                        }
                        board[i-1][j]++;
                    }
                    
                }
            }
        }
        
        
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}