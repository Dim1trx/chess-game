package chess.pieces;

import application.boardgame.Board;
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
}
