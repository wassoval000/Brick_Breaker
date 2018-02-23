import java.awt.*;

public class Paddle {

    int widthPaddle = 200;
    int heightPaddle = 24;
    int x = 318, y = 520;
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

    public void userMove(){

        if(game.isLeftPressed()){
            if(x>0){
                x -= 5;
            }


        }

    }

}

