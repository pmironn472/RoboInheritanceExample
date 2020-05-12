package robo;

public class RobotFactory {
    public static AbstractRobot getRobot(String name, String model) {

        switch (model){

            case "alpha":
                return new AlphaRobot(name, model);

            case "beta":
                return new BetaRobot(name, model);

            case "charlie":
                return new CharlieRobot(name,model);

            default:
                System.err.println("erRor");
                return null;
        }
    }
}
