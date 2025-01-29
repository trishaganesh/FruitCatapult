package com.trishawrites;

/**
 * Purpose: The purpose of this program is to choose a fruit and understand how we can calculate the distance of one throw
 * for the catapult by determining velocity values, angles, and calculating the distance.
 *
 * @author Trisha Ganesh
 * @version 6/29/2021
 *
 */
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class FruitCatapultTester {

    public static void main(String[] args) {
        String fruit = "Papaya";
        System.out.println();
        double allVelocities[] = {12.5, 21.5, 3.71, 10.9, 36.5};
        double allAngles[] = {10, 20, 30, 40, 50, 60};
        double distance[][] = new double[allVelocities.length][allAngles.length];

        for (int row = 0; row < allVelocities.length; row++) {
            for (int col = 0; col < allAngles.length; col++) {
                FruitCatapult catapult = new FruitCatapult(allVelocities[row], allAngles[col]);
                double dist = catapult.distance();
                distance[row][col] = dist;
            }
        }
        printResults(distance, allAngles, allVelocities);
    }


    public static void printResults(double[][] distance, double[] allAngles, double[] allVelocities) {


        System.out.println("              \t\t      Projectile Distance for Papaya             ");
        System.out.println("--------------------------------------------------------------------------------------------------");
        for (double allAng : allAngles) {
            System.out.print("\t\t   " + allAng + " deg");
        }
        System.out.println("\n");


        for (int row = 0; row < allVelocities.length; row++) {

            System.out.printf("%s", (allVelocities[row]) + " MPH");
            System.out.print("\t");

            for (int col = 0; col < allAngles.length; col++) {

                DecimalFormat number = new DecimalFormat("0.0000");
                System.out.printf("%9s \t", number.format(distance[row][col]) + " km");
                System.out.print("\t");
            }
            System.out.println("");
        }

    }
}

