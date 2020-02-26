import objectdraw.*;

public class Pong extends WindowController {

    private static final int CANVAS_WIDTH = 2000;
    private static final int CANVAS_HEIGHT = 1000;

    public void begin(){

        Table game = new Table(canvas, CANVAS_WIDTH, CANVAS_HEIGHT);
        game.runGame();
    }

    public static void main(String args[]){

        new Pong().startController(CANVAS_WIDTH, CANVAS_HEIGHT);
    }
}
