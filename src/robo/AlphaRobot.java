package robo;

public class AlphaRobot extends AbstractRobot {
    private String name;
    private String model;
    private int x;
    private int y;

    public AlphaRobot() {
    }

    public AlphaRobot(String name, String model) {
        setName(name);
        setModel(model);
        setY(0);
        setX(0);
    }


    public void setName(String name) {
        if (name == null) {
            System.err.println("Error Name");
        } else
            this.name = name;
    }

    public void setModel(String model) {
        if (model == null) {
            System.err.println("Error Name");
        } else
            this.model = model;
    }

    public void setX(int x) {
        if (x >= 0 && x <= 100) {
            this.x = x;
        } else
            System.err.println("Error X");
    }

    public void setY(int y) {
        if (y >= 0 && y <= 100) {
            this.y = y;
        } else
            System.err.println("Error Y");
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public boolean moveRight() {
        return direction("Right");
    }


    public boolean moveLeft() {
        return direction("Left");
    }


    public boolean moveDown() {
        return direction("Down");
    }


    public boolean moveUp() {
        return direction("Up");
    }


    public void setCharge(int charge) {

    }


    public byte getCharge() {
        return 0;
    }


    public boolean moveDownLeft() {
        return false;
    }

    public boolean moveDownRight() {
        return false;
    }


    public boolean moveUpLeft() {
        return false;
    }


    public boolean moveUpRight() {
        return false;
    }


    public boolean direction(String dir) {
        switch (dir) {
            case "Right":
                if (getX() < 100) {
                    setX(getX() + 1);
                    return true;
                }else return false;
            case "Left":
                if (getX() > 0) {
                    setX(getX() - 1);
                    return true;
                }else return false;
            case "Down":
                if (getY() < 100) {
                    setY(getY() + 1);
                    return true;
                }else return false;
            case "Up":
                if (getY() > 0) {
                    setY(getY() - 1);
                    return true;
                }else return false;
            default:
                return false;
        }
    }


}
