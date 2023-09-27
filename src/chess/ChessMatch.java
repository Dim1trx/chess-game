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

    public void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));


    }
}
