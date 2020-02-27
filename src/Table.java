import objectdraw.*;
import java.awt.*;

public class Table {

    private static final int PADDLE_WIDTH = 5;
    private static final int PADDLE_HEIGHT = 30;
    private static final int BALL_SPEED = 10;

    private Ball ball;
    private ComputerPaddle computer;
    private UserPaddle user;
    private DrawingCanvas table;

    public Table(DrawingCanvas canvas, int tableSizeX, int tableSizeY) {

        table = canvas;
        ball = new Ball(table);
        computer = new ComputerPaddle(table, PADDLE_WIDTH, PADDLE_HEIGHT, tableSizeX, tableSizeY);
        user = new UserPaddle(table, PADDLE_WIDTH, PADDLE_HEIGHT, tableSizeX, tableSizeY);
    }

    public void runGame() {

        System.out.println("eeeeeeeeeeeeeee");
    }
}