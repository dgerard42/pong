import objectdraw.*;
import java.awt.*;

public class Table {

    private Ball thisBall;
    private ComputerPaddle computer;
    private UserPaddle user;
    private DrawingCanvas table;

    public Table(DrawingCanvas canvas, StandardSizes sizes) {

        table = canvas;
        thisBall = new Ball(table, sizes);
        computer = new ComputerPaddle(table, sizes);
        user = new UserPaddle(table, sizes);
    }

    public UserPaddle getUser() {
        return user;
    }
}