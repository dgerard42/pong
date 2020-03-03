import objectdraw.*;

public class Ball extends ActiveObject {

   private FilledOval ball;
   private StandardSizes saveSizes;
   private int deltaX = 1;
   private int deltaY = 1;

    public Ball(DrawingCanvas table, StandardSizes sizes){

        ball = new FilledOval(sizes.getBallStartX(),
                sizes.getBallStartY(),
                sizes.getBallSize(),
                sizes.getBallSize(),
                table);
        saveSizes = sizes;
        start();
    }

    public void run(){

        while (true){
            ball.move(deltaX, deltaY);
            pause(saveSizes.getBallSpeed());
        }
    }


}
