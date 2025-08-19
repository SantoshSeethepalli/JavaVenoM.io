import java.util.List;

public class Apple implements Element {

    private final Position applePosition;
    private final String appleElement = "o";

    public Apple(final Board board) {
        applePosition =
                new Position(
                        RandomNumberGenerator.generate(board.getHeight()),
                        RandomNumberGenerator.generate(board.getWidth()),
                        appleElement);
    }

    public Position getPosition() {
        return applePosition;
    }

    void print() {
        System.out.println("Apple Position: " + applePosition.getXCoordinate() + "," + applePosition.getYCoordinate());
    }

    @Override
    public List<Position> getPositionDetails() {
        return List.of(applePosition);
    }
}