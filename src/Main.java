/**
 * Created by Thando Mini on 1/23/2017.
 */
public class Main {
    public static void main(String [] args){
        Vihicle mazda = new Vihicle(4, 2, false);
        Car porshe = new Car(4, 2, false, "puntseli", 8.2, true, true, 12, 400);

        porshe.speed(3000);

        mazda.landAirWater();
    }
}
