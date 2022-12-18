public class Bag {

    private int weight;

    public Bag() {
    }

    public Bag(int weight) {
        if(!(weight < 0) || !(weight > 20)) {
            this.weight = weight;
        } else {
            System.out.println("error: value invalid");
        }
    }

    public float getWeight() {
        return this.weight;
    }

    public void unpack(int weight) {
        if(!(this.weight - weight < 0)) {
            this.weight = this.weight - weight;
        } else {
            System.out.println("error: value invalid");
        }
    }

    public void pack(int weight) {
        if(!(this.weight + weight > 20)) {
            this.weight = this.weight + weight;
        } else {
            System.out.println("error: value invalid");
        }
    }
}
