import java.awt.*;

public class Ball {
    //Declare variables
    int diameterBall = 25;
    int speedBall = 5;
    int x, y;
    double dx, dy = speedBall;
    Board board;

    public void move(Paddle other){



    }

    public Ball(Board board){
        this.board = board;
        x=400;
        y=493;
    }

    public void posXY(int x, int y){
        this.x = x-diameterBall/2;
        this.y = y-diameterBall/2;
    }
    public int ballX(){
        return x;
    }
    public int ballY(){
        return y;
    }

    public void paint(Graphics g){
        g.fillOval(x, y, diameterBall, diameterBall);
    }


}
