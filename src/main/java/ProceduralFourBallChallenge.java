import processing.core.PApplet;

public class ProceduralFourBallChallenge extends PApplet {
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final int RGB1 = 340;
    public static final int BallDiameter = 20;
    public static final int ROWS = 5;
    private int speed=0;

    public static void main(String[] args) {
        PApplet.main("ProceduralFourBallChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        background(RGB1);
    }

    @Override
    public void draw() {
        for (int i = 1; i < ROWS; i++) {
            ellipse(speed*i,HEIGHT*i/ROWS, BallDiameter,BallDiameter);
        }
        speed++;
    }
}
