import processing.core.PApplet;
import java.util.List;
import java.util.ArrayList;
public class FourBalls extends PApplet {
    public static final int DIAMETER = 20;
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    public static final int frameDivisor = 5;

    //List<Object> list = new ArrayList<Object>();
    private List<Balls> balls;

    //constructor for list of Balls
    public FourBalls() {
        balls = new ArrayList<Balls>();
        int speed;
        int yPosition;
        for (int i = 0; i < 4; i++) {
            speed=i+1;
            yPosition=HEIGHT*speed/frameDivisor;
            balls.add(new Balls(speed,yPosition));
        }
    }

    public static void main(String[] args) {
        PApplet.main("FourBalls", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        newPositions();
        drawBalls();
    }

    void newPositions() {
        for (Balls ball : balls) {
            int newXPosition = ball.getXPosition() + ball.getVelocity();
            ball.setXPosition(newXPosition);
        }
    }

    void drawBalls() {
        for (Balls ball : balls) {
            drawCircle(ball.getXPosition(), ball.getYPosition());
        }
    }

    private void drawCircle(int xPosition, int yPosition) {
        ellipse(xPosition, yPosition, DIAMETER, DIAMETER);
    }
}

