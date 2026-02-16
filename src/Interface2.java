//This example demonstrates how an interface can be used to define common behavior for different classes (Bicycle and Bike) that implement the interface.
interface Vehicle{
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

class Bicycle implements Vehicle{
    int speed;
    int gear;

    public void changeGear(int newGear){
        gear = newGear;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printState(){
        System.out.println("Speed: " + speed + " : " + "Gear: " + gear);
    }
}

class Bike implements Vehicle{
    int speed;
    int gear;

    public void changeGear(int newGear){
        gear = newGear;
    }

    public void speedUp(int increment){
        speed = speed + increment;
    }

    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    public void printState(){
        System.out.println("Speed: " + speed + " : " + "Gear: " + gear);
    }
}

public class Interface2
{
    public static void main(String[] args)
    {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        bicycle.printState();

        Bike bike = new Bike();
        bike.changeGear(3);
        bike.speedUp(5);
        bike.applyBrakes(2);
        bike.printState();
    }
}
