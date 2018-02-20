import java.awt.*;

public class Brick {

    int widthBrick = 17;
    int heightBrick = 70;
    int x, y;
    Board board;
    Ball ball;
    Game game;
    int type = 0;
    Color[] brickColors = {Color.white, Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.CYAN, Color.magenta, Color.pink};

    public Brick(int x, int y, int type){
        posXY(x,y);
        this.type = type;
    }

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
        g.setColor(brickColors[type]);
        g.fillRect(x, y, widthBrick, heightBrick);

    }
}