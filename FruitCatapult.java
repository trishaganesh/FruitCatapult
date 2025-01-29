package com.trishawrites;
/**
 * Purpose: This is the Fruit Catapult Object Class
 *
 * @author Trisha Ganesh
 * @version 6/29/2021
 *
 */

public class FruitCatapult {

        private double velocity;
        private double angle;

        public FruitCatapult(double v, double a) {
            velocity = v;
            angle = a;
        }


        public double distance()
        {
            //convert from mph to meters per second
            double convertedVelocity = velocity * 0.44704;
            // meters
            double distance = (convertedVelocity * convertedVelocity) * Math.sin(2 * Math.toRadians(angle)) / 9.8;
            return distance * 0.001; //return in km
        }

        public double getVelocity() {
            return velocity;
        }

        public void setVelocity(double v) {
            velocity = v;
        }

        public double getAngle() {
            return angle;
        }

        public void setAngle(double a) {
            angle = a;
        }

    public String toString()
    {
        String str = String.format("%-30s %-30s", velocity, angle);
        return str;
    }

    }
