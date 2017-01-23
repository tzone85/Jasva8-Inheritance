/**
 * Created by Thando Mini on 1/23/2017.
 */
public class Main {
    public static void main(String [] args){
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Skoli", 8, 9, 2, 4, 1, 20, "short silk");

        dog.eat();
        dog.move();
    }
}
