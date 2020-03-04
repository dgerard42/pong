import objectdraw.*;

public class ComputerPaddle extends ActiveObject {

    private FilledRect computer;
    private int paddleY;
    private int paddleX;
    private StandardSizes sizes;

    public ComputerPaddle(DrawingCanvas table, StandardSizes sizes){

        paddleX = (sizes.getCanvasWidth() - (sizes.getCanvasWidth() / sizes.getPaddleSpaceSize())) - sizes.getPaddleOffsetX();
        paddleY = (sizes.getCanvasHeight() / 2) - sizes.getPaddleOffsetY();

        computer = new FilledRect(paddleX,
                paddleY,
                sizes.getPaddleWidth(),
                sizes.getPaddleHeight(),
                table);
        this.sizes = sizes;
        start();
    }

    public void run(){

        while (true){
            computer.moveTo(paddleX, paddleY);
            pause(sizes.getPaddleSpeed());
        }
    }

    public void setNewY(int newY) {
        paddleY = newY - sizes.getPaddleOffsetY();
    }

    public int getPaddleX(){
        return computer.getX() + (sizes.getPaddleOffsetX() * 2);
    }

    public FilledRect getComputerPaddle() {
        return computer;
    }
}
