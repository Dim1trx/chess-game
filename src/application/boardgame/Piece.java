package application.boardgame;

public abstract class Piece {
    protected Position piece;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.piece = null;
    }

    protected Board getBoard() {
        return board;
    }


}
