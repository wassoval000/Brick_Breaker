import java.awt.*;

public class Brick {

    int widthBrick = 17;
    int heightBrick = 70;
    int x, y;
    Board board;
    Ball ball;
    Game game;

    public void posXY(int x, int y) {
        this.x = x - (widthBrick / 2);
        this.y = y - (heightBrick / 2);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void paint(Graphics g) {
        g.fillRect(x, y, widthBrick, heightBrick);

    }
}