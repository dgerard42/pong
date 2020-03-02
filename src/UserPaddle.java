import objectdraw.*;

public class UserPaddle extends FilledRect {

//    private static final int PADDLE_SPACE_SIZE = 12;

    private FilledRect userPaddle;

    public UserPaddle(DrawingCanvas table, StandardSizes sizes){

        super(sizes.getPaddleWidth(),
                sizes.getPaddleHeight(),
                (sizes.getPaddleHeight() / sizes.getPaddleSpaceSize()),
                (sizes.getPaddleWidth() / sizes.getPaddleSpaceSize()),
                table);
    }
}
