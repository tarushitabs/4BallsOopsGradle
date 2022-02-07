public class Balls {
    private final int velocity;
    private int xPosition;
    private final int yPosition;

    public Balls(int velocity, int yPosition) {
        this.velocity = velocity;
        this.xPosition = 0;
        this.yPosition = yPosition;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }
}
