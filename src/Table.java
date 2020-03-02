import objectdraw.*;
import java.awt.*;

public class Table {

//    private static final int PADDLE_WIDTH = 5;
//    private static final int PADDLE_HEIGHT = 30;
//    private static final int BALL_SPEED = 10;

    private Ball ball;
    private ComputerPaddle computer;
    private UserPaddle user;
    private DrawingCanvas table;

    public Table(DrawingCanvas canvas, StandardSizes sizes) {

        table = canvas;
        ball = new Ball(table, sizes);
        computer = new ComputerPaddle(table, sizes);
      //  user = new UserPaddle(table, sizes);
    }

    public void runGame() {

        System.out.println("eeeeeeeeeeeeeee");
    }
}