import objectdraw.*;

public class Ball extends ActiveObject {

    private FilledOval ball;
    private StandardSizes saveSizes;
    private DrawingCanvas saveTable;
    private UserPaddle user;
    private ComputerPaddle computer;
    private int deltaX = 1;
    private int deltaY = 1;

    public Ball(DrawingCanvas table, StandardSizes sizes, UserPaddle user, ComputerPaddle computer) {

        ball = new FilledOval(sizes.getBallStartX(),
                sizes.getBallStartY(),
                sizes.getBallSize(),
                sizes.getBallSize(),
                table);
        saveSizes = sizes;
        saveTable = table;
        this.user = user;
        this.computer = computer;
        start();
    }

    public void run() {

        while (true) {
            if (ball.getX() > computer.getPaddleX() || ball.getX() <= user.getPaddleX()) {
                ball.hide();
                ball = new FilledOval(saveSizes.getBallStartX(),
                        saveSizes.getBallStartY(),
                        saveSizes.getBallSize(),
                        saveSizes.getBallSize(),
                        saveTable);
            } else if (ball.getY() <= 0 || ball.getY() >= saveSizes.getCanvasHeight()) {
                deltaY = -deltaY;
            } else if (ball.overlaps(computer.getComputerPaddle())
                    || ball.overlaps(user.getUserPaddle())) {
                deltaX = -deltaX;
            }
            ball.move(deltaX, deltaY);
            computer.setNewY(ball.getY());
            pause(saveSizes.getBallSpeed());
        }
    }
}