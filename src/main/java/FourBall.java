import processing.core.PApplet;

public class FourBall{

    private int xaxis;
    private int yaxis;
    private int diameter;
    private int speed;

    public FourBall(int Xaxis, int Yaxis, int diameter, int speed) {
        this.xaxis = Xaxis;
        this.yaxis = Yaxis;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void drawBall(PApplet draw) {
        draw.ellipse(this.xaxis,this.yaxis,this.diameter,this.diameter);
        this.xaxis+=this.speed;
    }
}
