/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author aalbanese
 */

public class RoadTrip {
    public static void main(String args[]) {
        String carMake = "2006 Chevy Silverado";
        String carName = "El Jefe";
        int maxPassengers = 5;
        int currentNumberOfPassengers = 1;
        
        boolean carFull = false;
        double tripometer = 0.0;
        double tripBudget = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance;
        int numberOfHitchhikers;
        
        System.out.println("<<< Road Trip Simulator >>>");
        System.out.println("--> Beginning of trip Stats <--");
        System.out.println("Make of vehicle: " + carMake);
        System.out.println("My vehicle's name is:  " + carName);
        System.out.println("Distance to Destination: " + distanceToMoabUtah);
        System.out.println("Full car? " + carFull + ": Current odometer: "
                            + tripometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println("Starting trip with " + currentNumberOfPassengers + 
                            " Passenger(s)");
        System.out.println("Destination reached? " + destinationReached);
        System.out.println("*************************************************");
        System.out.println();
        
        System.out.println("Beginning Leg 1: ");
        
        // calculate leg distance: 25% of total trip.  Store in legdistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToMoabUtah * decimalOfOneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        //increment tripometer by legdistance.  Overwrite tripometer
        tripometer = tripometer + legDistance;
        
        // subtract leg distance from distancetodestination. overwrite distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // "see" hitch hiker heading West
        System.out.println("Oh, look!  I think I see a hitch hiker"
                            + " who wants to go West, too!");
        
        numberOfHitchhikers = 1;
        if((currentNumberOfPassengers + numberOfHitchhikers) < maxPassengers){
            carFull = false;
            System.out.println("Car is not full.  Picking up " 
                                + numberOfHitchhikers + " hitch hiker(s) "
                                + "against my better judgement...");
            currentNumberOfPassengers = currentNumberOfPassengers + 
                                        numberOfHitchhikers;
        }else if((currentNumberOfPassengers + numberOfHitchhikers) == maxPassengers){
            carFull = true;
            System.out.println("I'm Picking up " + numberOfHitchhikers 
                                + " hitch hiker(s) and my car is now full");
            currentNumberOfPassengers = currentNumberOfPassengers + 
                                        numberOfHitchhikers;
        }else {
            carFull = false;
            System.out.println("Sorry people, there's " + numberOfHitchhikers
            + " of you and only " + (maxPassengers - currentNumberOfPassengers)
            + " seats open.  If you're not willing to split up then I'll "
            + "be on my way!");
                    }
       
        double gasPriceForLeg = (legDistance / 17) * 3.49;
        tripBudget = tripBudget - gasPriceForLeg;
        
        
        System.out.println();
        System.out.println("***Variable stats at the end of Leg 1***");
        System.out.println("Distance to Destination: " + distanceToMoabUtah);
        System.out.println("Full car? " + carFull + ": Current odometer: "
                            + tripometer);
        System.out.println("I have $" + tripBudget + " left to spend on "
                            + "this trip");
        System.out.println(currentNumberOfPassengers + " passengers in "
                            + "vehicle");
        System.out.println("Destination reached? " + destinationReached);
        System.out.println();
        
        legDistance = 500;
        gasPriceForLeg = (legDistance / 17) * 3.49;
        tripBudget = tripBudget - gasPriceForLeg;
        
        tripometer = tripometer + legDistance;
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        System.out.println("Beginning Leg 2: ");
        System.out.println("CHECK LEG DISTANCE: " + legDistance);

        // "see" 2 hitch hikers heading West
        numberOfHitchhikers = 2;
        System.out.println("Oh, look!  I think I see " + numberOfHitchhikers +
                            " hitch hikers who also want to go West!");
        // Check if there is room in the car.  if so, pick up hitch hiker
        if((currentNumberOfPassengers + numberOfHitchhikers) < maxPassengers){
            carFull = false;
            System.out.println("Car is not full.  Picking up " 
                                + numberOfHitchhikers + " hitch hiker(s) "
                                + "against my better judgement...");
            currentNumberOfPassengers = currentNumberOfPassengers + 
                                        numberOfHitchhikers;
        }else if((currentNumberOfPassengers + numberOfHitchhikers) == maxPassengers){
            carFull = true;
            System.out.println("I'm Picking up " + numberOfHitchhikers 
                                + " hitch hiker(s) and my car is now full");
            currentNumberOfPassengers = currentNumberOfPassengers + 
                                        numberOfHitchhikers;
        }else {
            carFull = false;
            System.out.println("Sorry people, there's " + numberOfHitchhikers
            + " of you and only " + (maxPassengers - currentNumberOfPassengers)
            + " seats open.  If you're not willing to split up then I'll "
            + "be on my way!");
                    }
        
        System.out.println();
        System.out.println("***Variable stats at the end of Leg 2***");
        System.out.println("Distance to Destination: " + distanceToMoabUtah);
        System.out.println("Full car? " + carFull + ": Current odometer: "
                            + tripometer);
        System.out.println("I have $" + tripBudget + " left to spend on "
                            + "this trip");
        System.out.println(currentNumberOfPassengers + " passengers in "
                            + "vehicle");
        System.out.println("Destination reached? " + destinationReached);
        System.out.println();
        
        legDistance = distanceToMoabUtah;
        gasPriceForLeg = (legDistance / 17) * 3.49;
        tripBudget = tripBudget - gasPriceForLeg;
        
        tripometer = tripometer + legDistance;
        
        
        System.out.println("Beginning Leg 3: ");
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        numberOfHitchhikers = 2;
        System.out.println("Oh, look!  I think I see " + numberOfHitchhikers +
                            " hitch hikers who also want to go West!");
        if((currentNumberOfPassengers + numberOfHitchhikers) < maxPassengers){
            carFull = false;
            System.out.println("Car is not full.  Picking up " 
                                + numberOfHitchhikers + " hitch hiker(s) "
                                + "against my better judgement...");
            currentNumberOfPassengers = currentNumberOfPassengers + 
                                        numberOfHitchhikers;
        }else if((currentNumberOfPassengers + numberOfHitchhikers) == maxPassengers){
            carFull = true;
            System.out.println("I'm Picking up " + numberOfHitchhikers 
                                + " hitch hiker(s) and my car is now full");
            currentNumberOfPassengers = currentNumberOfPassengers + 
                                        numberOfHitchhikers;
        }else {
            carFull = false;
            System.out.println("Sorry people, there's " + numberOfHitchhikers
            + " of you and only " + (maxPassengers - currentNumberOfPassengers)
            + " seat(s) open.  If you're not willing to split up then I'll "
            + "be on my way!");
                    }
        if (tripometer == 1806){
            destinationReached = true;
        }
        
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        System.out.println();
        System.out.println("***Variable stats at the end of Leg 3***");
        System.out.println("Distance to Destination: " + distanceToMoabUtah);
        System.out.println("Full car? " + carFull + ": Current odometer: "
                            + tripometer);
        System.out.println("I have $" + tripBudget + " left to spend on "
                            + "this trip");
        System.out.println(currentNumberOfPassengers + " passengers in "
                            + "vehicle");
        System.out.println("Destination reached? " + destinationReached);
        
        
        System.out.println();
        System.out.println("--> End of trip Stats <--");
        System.out.println("Make of vehicle: " + carMake);
        System.out.println("My vehicle's name is:  " + carName);
        System.out.println("Distance to Destination: " + distanceToMoabUtah);
        System.out.println("Full car? " + carFull + ": Current odometer: "
                            + tripometer);
        System.out.println("I have $" + tripBudget + " left after this trip");
        System.out.println("Ending trip with " + currentNumberOfPassengers + 
                            " Passenger(s)");
        System.out.println("Destination reached? " + destinationReached);
        System.out.println("*************************************************");
        
        
                      
    }
 }
