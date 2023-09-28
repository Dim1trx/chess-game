package chess.pieces;

import application.boardgame.Board;
import application.boardgame.Position;
import chess.ChessPiece;
import chess.Color;

import java.util.StringJoiner;

public class Rook extends ChessPiece{
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    protected boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

/*
        Position p = new Position(0, 0);
        // above
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() - 1);
        }
*/


        return mat;
    }
}
