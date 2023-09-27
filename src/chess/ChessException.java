package chess;

import application.boardgame.BoardException;

public class ChessException extends BoardException {
    public ChessException(String message) {
        super(message);
    }
}
