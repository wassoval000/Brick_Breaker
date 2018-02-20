import java.awt.*;

public class Paddle {

    int widthPaddle = 20;
    int heightPaddle = 70;
    int x = 50, y = 50;
    Board board;
    Ball ball;
    Game game;

    public void posXY (int x, int y){
        this.x = x-(widthPaddle/2);
        this.y = y-(heightPaddle/2);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void paint(Graphics g){
        g.fillRect(x, y, widthPaddle, heightPaddle);
    }

}
