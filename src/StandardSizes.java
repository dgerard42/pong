public class StandardSizes {

    private static final int CANVAS_WIDTH = 1000;
    private static final int CANVAS_HEIGHT = 500;

    private static final int PADDLE_SPACE_SIZE = 20;
    private static final int PADDLE_WIDTH = CANVAS_WIDTH / 50;
    private static final int PADDLE_HEIGHT = CANVAS_HEIGHT / 6;
    private static final int PADDLE_OFFSET_X = PADDLE_WIDTH / 2;
    private static final int PADDLE_OFFSET_Y = PADDLE_HEIGHT / 2;
    private static final int PADDLE_SPEED = 10;

    private static final int BALL_SPEED = 5;
    private static final int BALL_SIZE = CANVAS_WIDTH / 60;
    private static final int BALL_START_X = CANVAS_WIDTH / 2;
    private static final int BALL_START_Y = CANVAS_HEIGHT / 2;

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

    public static int getPaddleOffsetX() {
        return PADDLE_OFFSET_X;
    }

    public static int getPaddleOffsetY() {
        return PADDLE_OFFSET_Y;
    }

    public static int getPaddleSpeed() {
        return PADDLE_SPEED;
    }
}

