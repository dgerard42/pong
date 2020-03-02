import objectdraw.*;

public class ComputerPaddle extends ActiveObject {

//    private static final int PADDLE_SPACE_SIZE = 12;

    private FilledRect computer;

    public ComputerPaddle(DrawingCanvas table, StandardSizes sizes){

        int paddleX = sizes.getCanvasWidth() - (sizes.getCanvasWidth() / sizes.getPaddleSpaceSize());
        int paddleY = sizes.getCanvasHeight() - (sizes.getCanvasHeight() / sizes.getPaddleSpaceSize());

        computer = new FilledRect(paddleX, paddleY,  sizes.getPaddleWidth(), sizes.getPaddleHeight(), table);
//        computer = new FilledRect( table);
    }

}
