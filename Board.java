public class Board {
    private final int height;
    private final int width;


    public Board(final int height, final int width){
        this.height = height;
        this.width = width;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }

    public void print() {
        Apple newApple = new Apple(this);
        Snake newSnake = new Snake(this);

        newApple.print();
        newSnake.print();
    }
}