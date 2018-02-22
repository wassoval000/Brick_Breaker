import java.awt.*;

public class GameStates {

    private static boolean isPlay = false;
    private static boolean isPause = false;
    private static boolean isMenu = false;
    private static boolean isEnd = false;
    private static int timescore = new Integer(0);

    public static Integer getTScore () {

        timescore = Board.ticks%60;
        return timescore;

    }

    public static boolean isPlay(){
        return isPlay;
    }
    public static boolean isPause(){
        return isPause;
    }
    public static boolean isMenu(){
        return isMenu;
    }
    public static boolean isEnd(){
        return isEnd;
    }
    public static void startPlay(){
        isPlay = true;
    }
    public static void stopPlay(){
        isPlay = false;
    }
    public static void startMenu(){
        isMenu = true;
    }
    public static void stopMenu(){
        isMenu = false;
    }
    public static void startPause(){
        isPause = true;
    }
    public static void stopPause(){
        isPause = false;
    }
    public static void endGame(){
        isEnd = true;
    }
    public static void startGame(){
        isEnd = false;
    }
    public static void playP(){

        if(isPlay){

            isPlay = false;

        }
        else{

            isPlay = true;

        }

    }

    public static void pauseP(){

        if(isPause){

            isPause = false;

        }
        else{

            isPause = true;

        }

    }

    public static void menu (){

        if(isMenu){

         isMenu = false;

        }
        else{

            isMenu = true;

        }

    }

}
