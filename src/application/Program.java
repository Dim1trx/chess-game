package application;

import application.boardgame.Board;
import application.boardgame.Position;

public class Program {
    public static void main(String[] args) {
        Board board = new Board(8, 8);

        Position position = new Position(0, 0);

        System.out.println("position = " + position);
    }
}
