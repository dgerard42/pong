import objectdraw.*;
import java.awt.*;

public class Table {

    private Ball thisBall;
    private ComputerPaddle computer;
    private UserPaddle user;
    private DrawingCanvas table;

    public Table(DrawingCanvas canvas, StandardSizes sizes) {

        table = canvas;
        computer = new ComputerPaddle(table, sizes);
        user = new UserPaddle(table, sizes);
        thisBall = new Ball(table, sizes, user, computer);
    }

    public UserPaddle getUser() {
        return user;
    }
}