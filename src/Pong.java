import objectdraw.*;

public class Pong extends WindowController {

    private static StandardSizes sizes;
    private Table game;

    public void onMouseMove(Location point){

        UserPaddle user = game.getUser();
        int newY = point.getY();
        user.MovePaddle(((sizes.getCanvasWidth() / sizes.getPaddleSpaceSize()) - sizes.getPaddleOffsetX()), newY);
    }

    public void begin(){
        game = new Table(canvas, sizes);
    }

    public static void main(String args[]){

        sizes = new StandardSizes();
        new Pong().startController(sizes.getCanvasWidth(), sizes.getCanvasHeight());
    }
}
