//tc = O(n^n)

import java.util.*;

public class nqueens {

    public boolean isSafe(int row,int col,char[][] board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }

        //vertical
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //upper left
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //upper right
        r=row;
        for(int c=col;c<board.length && r>=0 ; r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower left
        r=row;
        for(int c=col;c>=0 && r<board.length ; r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        //lower right
        r=row;
        for(int c=col;c<board.length && r<board.length ; c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards){
        String row ="";
        List<String> newBoard = new ArrayList<>();

        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q')
                row+='Q';
                else
                 row+='.';

            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    
    }


 
     public void helper(char[][] board, List<List<String>> allBoards, int row) {
        if (row == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, row + 1);
                board[row][col] = '.'; // backtrack
            }
        }
    }



 public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        nqueens nq = new nqueens();
        int n = 4;
        List<List<String>> solutions = nq.solveNQueens(n);

        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
