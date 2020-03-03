import objectdraw.*;

public class UserPaddle extends FilledRect {

    public UserPaddle(DrawingCanvas table, StandardSizes sizes){

        super(((sizes.getCanvasWidth() / sizes.getPaddleSpaceSize()) - sizes.getPaddleOffsetX()),
                ((sizes.getCanvasHeight() / 2) - sizes.getPaddleOffsetY()),
                sizes.getPaddleWidth(),
                sizes.getPaddleHeight(),
                table);
    }

    public void MovePaddle(){

    }
}
