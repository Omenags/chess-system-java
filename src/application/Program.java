package application;

import boardgame.Board;
import boardgame.Position;

public class Program {
    public static void main(String[] args) {


        Position po = new Position(5,8);

        Board board = new Board(8,8);

        System.out.println(po);
    }
}
