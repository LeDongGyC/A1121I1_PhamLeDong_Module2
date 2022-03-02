package ss6_inheritance.bai_tap.lop_point_and_moveablepoint;

public class MovablePoint extends Point{
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = {this.getxSpeed(), this.getySpeed()};
        return arr;
    }

    public String toString(){
        return "("+this.getX()+","+this.getY()+"), speed = ("+this.getxSpeed()+","+this.getySpeed()+")";
    }

    public MovablePoint move(){
        this.setxSpeed(this.getX()+ this.getxSpeed());
        this.setySpeed(this.getY()+ this.getySpeed());
        return this;
    }
}
