package chess;

import application.boardgame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
    }

    public ChessPiece[][] getPieces(){
        int rows = board.getRows();
        int colums = board.getColumns();
        ChessPiece[][] mat = new ChessPiece[rows][colums];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
         
        return mat;
    }
}
