import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends  JPanel implements ActionListener{


    Ball ball;
    Paddle userPaddle;
    Brick pExtend, pDecrease,pFast, pSlow, bLarge, bSmall, bFast, bSlow, brick;
    Timer timer;
    int ticks = 0;
    static Brick[][] brickArr;

    public Board(Game game){
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        ball = new Ball(this);
        userPaddle = new Paddle();
        timer = new Timer(1000/60, this);
        timer.start();
        brickArr = new Brick[7][8];

    }
    public static void Start(){
        for(int i = 0; i < brickArr.length; i++){
            for(int j = 0; j < brickArr[0].length; j++){
                brickArr[i][j] = new Brick( j*Brick.getWidth(), i*Brick.getHeight(), 0 );
            }
        }
    }
    public void paint(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        ball.paint(g);
        userPaddle.paint(g);
        for(int i = 0; i < brickArr.length; i++){
            for(int j = 0; j < brickArr[0].length; j++){
                brickArr[i][j].paint(g);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ticks += 1;

    }

}
