package main;

import robo.AlphaRobot;
import robo.BetaRobot;
import robo.CharlieRobot;
import tests.ChargeTest;
import tests.DiagonalWalkTest;
import tests.SimpleTest;

public class Application {
    public static void main(String[] args) {


        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(new CharlieRobot("Robik", "alpha")));
        System.out.println();
        System.out.printf("Simple test passed %d%%\n", ChargeTest.chargeTest(new CharlieRobot("Robo", "beta")));
        System.out.println();
        System.out.printf("Simple test passed %d%%\n", DiagonalWalkTest.diagonalWalkTest(new CharlieRobot("Robo", "beta")));
    }
}
