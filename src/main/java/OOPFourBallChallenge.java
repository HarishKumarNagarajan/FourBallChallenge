import processing.core.PApplet;

public class OOPFourBallChallenge extends PApplet {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final int ROWS = 4;
    public FourBall[] newBall = new FourBall[ROWS];
    public static void main(String[] args) {
        PApplet.main("OOPFourBallChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        background(340);
        for (int i = 0; i < ROWS; i++) {
            newBall[i] = new FourBall(0, HEIGHT*(i+1)/5, 20,i+1);
        }
    }

    @Override
    public void draw() {
        for (int i = 0; i < ROWS; i++) {
            newBall[i].drawBall(this);
        }
    }
}
