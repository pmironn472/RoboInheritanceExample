package main;

import robo.*;
import tests.ChargeTest;
import tests.DiagonalWalkTest;
import tests.SimpleTest;

public class Application {
    public static void main(String[] args) {

        AbstractRobot IronManMark_31 = RobotFactory.getRobot("IronMan","alpha");
        AbstractRobot IronManMark_32 = RobotFactory.getRobot("IronMan","beta");
        AbstractRobot IronManMark_33 = RobotFactory.getRobot("IronMan","charlie");


        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(IronManMark_31));
        System.out.println();
        System.out.printf("Simple test passed %d%%\n", ChargeTest.chargeTest(IronManMark_32));
        System.out.println();
        System.out.printf("Simple test passed %d%%\n", DiagonalWalkTest.diagonalWalkTest(IronManMark_33));
    }
}
