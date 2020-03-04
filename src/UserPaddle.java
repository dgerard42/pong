import objectdraw.*;

public class UserPaddle extends ActiveObject {

    private FilledRect userPaddle;
    private StandardSizes sizes;

    public UserPaddle(DrawingCanvas table, StandardSizes sizes){

        userPaddle = new FilledRect(((sizes.getCanvasWidth() / sizes.getPaddleSpaceSize()) - sizes.getPaddleOffsetX()),
                ((sizes.getCanvasHeight() / 2) - sizes.getPaddleOffsetY()),
                sizes.getPaddleWidth(),
                sizes.getPaddleHeight(),
                table);
        this.sizes = sizes;
        start();
    }

    public int getPaddleX(){
        return userPaddle.getX();
    }

    public void MovePaddle(int newX, int newY){
        userPaddle.moveTo(newX, newY);
    }

    public FilledRect getUserPaddle(){
        return userPaddle;
    }
}
