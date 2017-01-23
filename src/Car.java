/**
 * Created by Thando Mini on 1/23/2017.
 */
public class Car extends Vihicle {
    private String model;
    private double enginSize;
    private boolean suv;
    private boolean handSteering;
    private int changingGeers;
    private int kmps;

    public Car(int wheeles, int doors, boolean alive, String model, double enginSize, boolean suv, boolean handSteering, int changingGeers, int kmps) {
        super(wheeles, doors, alive);
        this.model = model;
        this.enginSize = enginSize;
        this.suv = suv;
        this.handSteering = handSteering;
        this.changingGeers = changingGeers;
        this.kmps = kmps;
    }

    public void speed(int kmps){
        System.out.println("Car.speed() called");
        System.out.println("car is moving at "+kmps+"km/s");
    }

    public void frontWheelDrive(boolean drive){
        System.out.println("Car.frontWheelDrive() was called.");
    }

    @Override
    public void landAirWater() {
        System.out.println("Car.landAirWater() was called");
        landAirWater();
    }

    @Override
    public void increasedSpeed(int someSpeed) {
        System.out.println("Car.increasedSped() called");
        increasedSpeed(someSpeed);
    }

    @Override
    public void decreasedSpeed(int someSpeed) {
        System.out.println("Car.decreasedSpeed() called");
//      to always get the speed from the super class
        super.decreasedSpeed(someSpeed);
    }

    @Override
    public void changingGear(int gear) {
        System.out.println("Car.changingGear() called");
        changingGear(gear);
    }
}
