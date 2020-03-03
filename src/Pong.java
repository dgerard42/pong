import objectdraw.*;

public class Pong extends WindowController {

    private static StandardSizes sizes;
    private Table game;

    public void onMouseMove(Location point){

        game.
    }

    public void begin(){

        game = new Table(canvas, sizes);
    }

    public static void main(String args[]){

        sizes = new StandardSizes();
        new Pong().startController(sizes.getCanvasWidth(), sizes.getCanvasHeight());
    }
}
