import objectdraw.*;

public class UserPaddle extends FilledRect {

    private static final int PADDLE_SPACE_SIZE = 12;

    private FilledRect userPaddle;

    public UserPaddle(DrawingCanvas table, int paddleWidth, int paddleHeight, int tableWidth, int tableHeight){

        int paddleX = tableWidth - (tableWidth / PADDLE_SPACE_SIZE);
        int paddleY = tableHeight - (tableHeight / PADDLE_SPACE_SIZE);

        userPaddle = new super(paddleWidth, paddleHeight, paddleX, paddleY, table);
    }
}
