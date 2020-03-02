public class StandardSizes {

    private static final int CANVAS_WIDTH = 1000;
    private static final int CANVAS_HEIGHT = 500;

    private static final int PADDLE_SPACE_SIZE = 12;
    private static final int PADDLE_WIDTH = CANVAS_WIDTH / 50;
    private static final int PADDLE_HEIGHT = CANVAS_HEIGHT / 7;

    private static final int BALL_SPEED = 10;
    private static final int BALL_SIZE = 20;
    private static final int BALL_START_X = 50;
    private static final int BALL_START_Y = 50;

    public StandardSizes(){}

    public static int getCanvasWidth() {
        return CANVAS_WIDTH;
    }

    public static int getPaddleSpaceSize() {
        return PADDLE_SPACE_SIZE;
    }

    public static int getCanvasHeight() {
        return CANVAS_HEIGHT;
    }

    public static int getPaddleWidth() {
        return PADDLE_WIDTH;
    }

    public static int getPaddleHeight() {
        return PADDLE_HEIGHT;
    }

    public static int getBallSpeed() {
        return BALL_SPEED;
    }

    public static int getBallSize() {
        return BALL_SIZE;
    }

    public static int getBallStartX() {
        return BALL_START_X;
    }

    public static int getBallStartY() {
        return BALL_START_Y;
    }
}