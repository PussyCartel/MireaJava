package ru.mirea.task7;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;
    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
