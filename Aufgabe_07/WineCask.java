/**
Author: Markus Stumpfel
Project: https://github.com/bi-tux/pos-homework
**/

public class WineCask {

    private String name;
    private int capacity;
    private int content;

    public WineCask() {
        setName("--nameless--");
        setCapacity(200);
        setContent(0);
    }

    public WineCask(String name, int capacity, int content) {
        setName(name);
        setCapacity(capacity);
        setContent(content);
    }

    public void setName(String name) {
        if(name != null && name.length() >= 6 && name.length() <= 20) {
            this.name = name;
        } else if(name.length() < 6) {
            System.out.println("Error in method 'public void setName()': String 'name' has to contain at least 6 character");
        } else if(name.length() > 20) {
            System.out.println("Error in method 'public void setName()': String 'name' can't contain more then 20 character");
        } else if(name == "null") {
            System.out.println("Error in method 'public void setName()': String 'name' is either not set or named 'null'");
        }
    }

    private String check;

    private void checkOk() {
        if(this.capacity > 0 && this.content >= 0 && this.content <= this.capacity) {
            this.check = "ok";
        } else {
            this.check = "err";
        }
    }

    public void setCapacity(int capacity) {
        if(this.check == "ok") {
            this.capacity = capacity;
        } else {
            System.out.println("Error in method 'public void setCapacity()': capacity has to be > 0 and >= content");
        }
    }

    public void setContent(int content) {
        if(this.check == "ok") {
            this.content = content;
        } else {
            System.out.println("Error in method 'public void setContent': content has to be >= 0 and <= capacity");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getContent() {
        return this.content;
    }

    public void drawOff(int quantity) {
        if(quantity <= this.content) {
            this.content = this.content - quantity;
        } else if(quantity > this.content) {
            System.out.println("Error in method 'public void drawOff()': not enougth content to draw off");
        } else if(quantity == 0) {
            System.out.println("nothing happend");
        }
    }

    public int fillCask() {
        int quant = this.capacity - this.content;
        this.content = this.capacity;
        return quant;
    }

    public String toString() {
        return "WineCask\t|\tname: " + this.name + ",\tcapacity: " + this.capacity + ",\tcontent: " + this.content;
    }

    public void printInfo() {
        System.out.println(toString());
    }

}
