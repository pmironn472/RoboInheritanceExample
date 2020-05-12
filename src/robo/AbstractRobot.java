package robo;

abstract public class AbstractRobot {
    public abstract void setName(String name);
    public abstract String getName();

    public abstract void setModel(String model);
    public abstract String getModel();

    public abstract void setX(int x);
    public abstract int getX();

    public abstract void setY(int y);
    public abstract int getY();

    public abstract boolean moveRight();
    public abstract boolean moveLeft();
    public abstract boolean moveDown();
    public abstract boolean moveUp();

    public abstract void setCharge(int charge);
    public abstract byte getCharge();


    public abstract boolean moveDownLeft();
    public abstract boolean moveDownRight();
    public abstract boolean moveUpLeft();
    public abstract boolean moveUpRight();
}
