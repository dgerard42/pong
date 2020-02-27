import objectdraw.*;

public class ComputerPaddle extends ActiveObject {

    private static final int PADDLE_SPACE_SIZE = 12;

    private FilledRect computer;

    public ComputerPaddle(DrawingCanvas table, int paddleWidth, int paddleHeight, int tableWidth, int tableHeight){

        int paddleX = tableWidth - (tableWidth / PADDLE_SPACE_SIZE);
        int paddleY = tableHeight - (tableHeight / PADDLE_SPACE_SIZE);

        computer = new FilledRect(paddleWidth, paddleHeight, paddleX, paddleY, table);
    }

}
