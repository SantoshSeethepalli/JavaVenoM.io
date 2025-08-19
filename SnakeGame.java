import java.util.Scanner;

public class SnakeGame {

    public static Direction getDirection(int InputValue) {
        Direction headDirection = Direction.Right;
        switch(InputValue) {
            case 119:
                headDirection = Direction.Up;
                break;
            case 100:
                headDirection = Direction.Right;
                break;
            case 115:
                headDirection = Direction.Down;
                break;
            case 97:
                headDirection = Direction.Left;
                break;
        }

        return headDirection;
    }

    public static void main(String[] args) throws IndexOutOfBoundsException {
        Scanner scan = new Scanner(System.in);
        Direction headDirection;

        Board newBoard = new Board(10, 10);
        Apple newApple = new Apple(newBoard);
        Snake newSnake = new Snake(newBoard);

        newBoard.addElement(newApple);
        newBoard.addElement(newSnake);


        try {
            while (!(newSnake.collidingWithWall(newBoard))) {
                System.out.println("Choose Direction from (w, d, s, a): ");
                int inputKey = (int) scan.next().charAt(0);

                headDirection = getDirection(inputKey);
                newSnake.setHeadDirection(headDirection);

                newSnake.moveSnake();
                if (newSnake.getHead().equals(newApple.getPosition())) {
                    newSnake.increaseSize();

                    newBoard.deleteElement(newApple);
                    newApple = new Apple(newBoard);
                    newBoard.addElement(newApple);
                }

                newBoard.printBoard();
            }

            scan.close();
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Snake Hit the wall!!");

        }
    }
}

