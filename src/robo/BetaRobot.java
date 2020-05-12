package robo;

public class BetaRobot extends AlphaRobot {

    private byte charge;

    public BetaRobot(){ }

    public BetaRobot(String name, String model){
        super(name, model);
        setCharge(0);
    }

    public void setCharge(int charge){
        if(charge >= 0 && charge <= 100 ){
            this.charge = (byte)charge;
        }else System.err.println("Error Charge");
    }

    public byte getCharge(){
        return charge;
    }

    public boolean checkCharge (){
        if(charge <= 5){
            return false;
        }else return true;
    }
    public boolean moveRight() {
        if(checkCharge() && super.moveRight()) {
            setX(getX() + 1);
            charge--;
            return true;
        }else return false;
    }


    public boolean moveLeft() {
        if(checkCharge() && super.moveLeft()) {
            setX(getX() - 1);
            charge--;
            return true;
        }else return false;
    }


    public boolean moveDown() {
        if(checkCharge() && super.moveDown()) {
            setY(getY() + 1);
            charge--;
            return true;
        }else return false;
    }


    public boolean moveUp() {
        if(checkCharge() && super.moveUp()) {
            setY(getY() -1);
            charge--;
            return true;
        }else return false;
    }

}
