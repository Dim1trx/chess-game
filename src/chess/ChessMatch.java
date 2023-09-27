package chess;

import application.boardgame.Board;
import application.boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        this.board = new Board(8,8);
        this.initialSetup();
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

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    public void initialSetup(){
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1,new King(board, Color.WHITE));
    }
}
