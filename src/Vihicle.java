/**
 * Created by Thando Mini on 1/23/2017.
 */
public class Vihicle {
    private int wheeles;
    private int doors;
    private boolean alive;

    public Vihicle(int wheeles, int doors, boolean alive) {
        this.wheeles = wheeles;
        this.doors = doors;
        this.alive = alive;
    }

    public void landAirWater(){
        System.out.println("Vihicle.landAirWater() was called");
    }

    public void increasedSpeed(int someSpeed){
        System.out.println("Vihicle.increasedSpeed() called");
    }

    public void decreasedSpeed(int someSpeed){
        System.out.println("Vihicle.decreasedSpeed() called");
    }

    public void changingGear(int gear){
        System.out.println("Vihicle.changeingGear() was called");
    }
    public int getWheeles() {
        return wheeles;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isAlive() {
        return alive;
    }
}
