import objectdraw.*;

public class Pong extends WindowController {

    private static StandardSizes sizes;

    public void begin(){

        Table game = new Table(canvas, sizes);
        game.runGame();
    }

    public static void main(String args[]){

        sizes = new StandardSizes();
        new Pong().startController(sizes.getCanvasWidth(), sizes.getCanvasHeight());
    }
}
