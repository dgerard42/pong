import objectdraw.*;

public class UserPaddle extends ActiveObject {

    private FilledRect userPaddle;

    public UserPaddle(DrawingCanvas table, StandardSizes sizes){

        userPaddle = new FilledRect(((sizes.getCanvasWidth() / sizes.getPaddleSpaceSize()) - sizes.getPaddleOffsetX()),
                ((sizes.getCanvasHeight() / 2) - sizes.getPaddleOffsetY()),
                sizes.getPaddleWidth(),
                sizes.getPaddleHeight(),
                table);
        start();
    }

    public void MovePaddle(int newX, int newY){
        userPaddle.moveTo(newX, newY);
    }

    public FilledRect getUserPaddle(){
        return userPaddle;
    }
}
