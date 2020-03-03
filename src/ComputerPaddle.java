import objectdraw.*;

public class ComputerPaddle extends ActiveObject {

    private FilledRect computer;
    private int deltaY = 1;

    public ComputerPaddle(DrawingCanvas table, StandardSizes sizes){

        int paddleX = sizes.getCanvasWidth() - (sizes.getCanvasWidth() / sizes.getPaddleSpaceSize());
        int paddleY = sizes.getCanvasHeight() / 2;

        computer = new FilledRect((paddleX - sizes.getPaddleOffsetX()),
                (paddleY - sizes.getPaddleOffsetY()),
                sizes.getPaddleWidth(),
                sizes.getPaddleHeight(),
                table);
        start();
    }

    public void run(){

        while (true){
            computer.move(0, deltaY);
            pause(30);
        }
    }
}
