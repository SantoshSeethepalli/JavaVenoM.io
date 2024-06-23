public class Position {
    private final int xCoordinate;
    private final int yCoordinate;
    private String character;

    Position(final int xCoordinate, final int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.character = ".";
    }

    Position(final int xCoordinate, final int yCoordinate, final String character) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.character = character;
    }

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    public String getCharacter() {
        return this.character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return character;
    }
}
