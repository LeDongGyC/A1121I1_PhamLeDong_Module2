package ss6_inheritance.bai_tap.lop_point_and_moveablepoint;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(1.5f, 3f);
        System.out.println(point);

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setXY(1.5f, 2.5f);
        movablePoint.setSpeed(4f,5f);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}
