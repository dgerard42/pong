import objectdraw.*;

public class Ball extends ActiveObject {

    private static final int BALL_SIZE = 20;
    private static final int BALL_START_X = 50;
    private static final int BALL_START_Y = 50;

    private FilledOval ball;

    public Ball(DrawingCanvas table){

        ball = new FilledOval(BALL_START_X, BALL_START_Y, BALL_SIZE, BALL_SIZE, table);
    }
}
