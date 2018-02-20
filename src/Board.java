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

    public Board(Game game){
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        ball = new Ball(this);
        userPaddle = new Paddle();
        timer = new Timer(1000/60, this);
        timer.start();

    }
    public void paint(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        ball.paint(g);
        userPaddle.paint(g);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ticks += 1;

    }

}
