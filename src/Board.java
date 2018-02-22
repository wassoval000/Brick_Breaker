import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Board extends  JPanel implements ActionListener{


    Ball ball;
    Paddle userPaddle;
    Brick[][] arrayRow;
    Brick pExtend, pDecrease,pFast, pSlow, bLarge, bSmall, bFast, bSlow, brick;
    final int gap = 1;
    int row = 5;
    int rowNum;
    int col = 7;
    int bWidth = 5;
    int bHeight = 6;
    Timer timer;
    static int ticks = 0;
    static Brick[][] brickArr;


    /*public Board(int rowNum, Board board){
        this.board = board;
        this.rowNum = rowNum;

        arrayRow = new Brick[col][row];
        bWidth = (600-(2*gap))*row;

        for(int i = 0; i < arrayRow[0].length; i++){
            for(int j = 0; j < arrayRow.length; j++){

                arrayRow[j][i] = new Brick(gap*(i)+(bWidth*i),(-gap*(j))-(Brick.getHeight()*j),rowNum,bWidth,Brick.getHeight(),this);

            }


        }

    }*/

    public Board(Game game){
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
        ball = new Ball(this);
        userPaddle = new Paddle();
        timer = new Timer(1000/60, this);
        timer.start();
        brickArr = new Brick[7][8];
        Start();

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

    public static int tellTicks (int ticks){

        return ticks;

    }

    @Override
     public void actionPerformed(ActionEvent e) {
        ticks += 1;

    }

    public int getRow(){

        return row;

    }

    public int getCol(){

        return col;

    }
}
