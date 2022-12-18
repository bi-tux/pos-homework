/*
 * Author: Markus Stumpfel
 * Project:
 */
public class Bike {

    private Person driver;
    private Bag bag1;
    private Bag bag2;

    public Bike() {
    }

    public void getOn(Person driver) {
        if(!(this.driver == null) && !(driver == null)) {
            System.out.println("current driver is getting replaced");
            this.driver = driver;
        } else if(!(driver == null)) {
            this.driver = driver;
        } else {
            System.out.println("error: value invalid");
        }
    }

    public void getOf() {
        this.driver = null;
        System.out.println("driver removed, no errors reported");
    }

    public boolean putOnBag(Bag bag1, Bag bag2) {
        if(this.bag1 == null && !(this.bag2 == null)) {
            this.bag1 = bag1;
            return true;
        } else if(this.bag2 == null && !(this.bag1 == null)) {
            this.bag2 = bag2;
            return true;
        } else if(this.bag1 == null && this.bag2 == null) {
            this.bag1 = bag1;
            this.bag2 = bag2;
            return true;
        } else if(!(this.bag1 == null) && !(bag1 == null)) {
            System.out.println("error: atribute bag1 allready exists and isn't empty");
            return false;
        } else if(!(this.bag2 == null) && !(bag2 == null)) {
            System.out.println("error: atribute bag2 already exists and isn't empty");
            return false;
        } else {
            return false;
        }
    }

     public float calculateTime(float way) {
        float velocity = 25;
        if(this.driver == null) {
            return -1;
        } else if(!(this.bag1 == null) && this.bag2 == null) {
            float slow = bag1.getWeight()/2;
            velocity = velocity - slow;
            return (way/velocity)*60;
        } else if(this.bag1 == null && !(this.bag2 == null)) {
            float slow = bag2.getWeight()/2;
            velocity = velocity - slow;
            return (way/velocity)*60;
        } else if(!(this.bag1 == null && this.bag2 == null)) {
            float slow = bag1.getWeight()/2 + bag2.getWeight()/2;
            velocity = velocity - slow;
            return (way/velocity)*60;
        } else {
            return (way/velocity)*60;
        }
    }

    public void printInfo() {
        float velocity = 25;
        System.out.println("Bike:");
        if(this.driver == null) {
            System.out.println("Driver: no driver");
        } else {
            System.out.println("Driver: " + this.driver.getName());
        }
        if(this.bag1 == null && this.bag2 == null) {
            System.out.println("Extra weight: no extra weight");
        } else if(!(this.bag1 == null) && bag2 == null) {
            System.out.println("Extra weight: " + bag1.getWeight());
        } else if(this.bag1 == null && !(this.bag2 == null)) {
            System.out.println("Extra weight: " + bag2.getWeight());
        } else {
            float weight = bag1.getWeight() + bag2.getWeight();
            System.out.println("Extra weight: " + weight);
        }
        if(this.bag1 == null && this.bag2 == null) {
            System.out.println("Velocity: 25km/h");
        } else if(!(this.bag1 == null) && this.bag2 == null) {
            velocity = velocity - bag1.getWeight()/2;
            System.out.println("Velocity: " + velocity + "km/h");
        } else if(this.bag1 == null && !(this.bag2 == null)) {
            velocity = velocity - bag2.getWeight()/2;
            System.out.println("Velocity: " + velocity + "km/h");
        } else if(!(this.bag1 == null && this.bag2 == null)) {
            velocity = velocity - bag1.getWeight()/2 - bag2.getWeight()/2;
            System.out.println("Velocity: " + velocity + "km/h");
        }
        System.out.println("===================");
    }
}
