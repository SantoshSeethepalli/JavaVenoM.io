import java.util.Random;
public class Apple {

    Position applePosition;
    public Apple(final Board board) {
        applePosition =
                new Position(
                        RandomNumberGenerator.generate(board.getHeight()),
                        RandomNumberGenerator.generate(board.getWidth()));
    }

    void print() {
        System.out.println("Apple Position: " + applePosition.getXCoordinate() + "," + applePosition.getYCoordinate());
    }
}