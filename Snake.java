import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Snake {
    List<Position> snakeBody = new ArrayList<>();

    public Snake(final Board board) {
        snakeBody.add(
                new Position(
                        RandomNumberGenerator.generate(board.getHeight()),
                        RandomNumberGenerator.generate(board.getWidth())));
    }

    void print() {
        System.out.println("Snake Position: ");
        for (Position x : snakeBody) {
            System.out.println( x.getYCoordinate() + "," + x.getYCoordinate());
        }
    }

}
