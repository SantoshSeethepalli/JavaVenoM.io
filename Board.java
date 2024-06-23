import java.util.ArrayList;
import java.util.List;

public class Board {
    private final int height;
    private final int width;

    private List<List<Position>> board = new ArrayList<>();

    private List<Element> elementsOfBoard = new ArrayList<>();


    public Board(final int height, final int width){
        this.height = height;
        this.width = width;
        for (int i=0; i < height; i++) {
            List<Position> row = new ArrayList<>();
            for (int j=0; j < width; j++) {
                row.add(new Position(i, j));
            }
            board.add(row);
        }
    }
    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }

    void printBoard() {
        for (Element element : elementsOfBoard) {
            List<Position> positions  = element.getPositionDetails();
            for (Position position : positions) {
                board.get(position.getXCoordinate()).get(position.getYCoordinate()).setCharacter(position.getCharacter());
            }
        }

        for (int i=0; i < height; i++) {
            for (int j=0; j < width; j++) {
                System.out.print(board.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public void addElement(final Element element) {
        elementsOfBoard.add(element);
    }
}