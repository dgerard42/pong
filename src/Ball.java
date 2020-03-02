import objectdraw.*;

public class Ball extends ActiveObject {

//    private static final int BALL_SIZE = 20;
//    private static final int BALL_START_X = 50;
//    private static final int BALL_START_Y = 50;

    private FilledOval ball;

    public Ball(DrawingCanvas table, StandardSizes sizes){

        ball = new FilledOval(sizes.getBallStartX(),
                sizes.getBallStartY(),
                sizes.getBallSize(),
                sizes.getBallSize(),
                table);
    }
}
