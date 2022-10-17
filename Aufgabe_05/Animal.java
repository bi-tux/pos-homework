public class Animal {
    private String name = "-unknown-";
    private String genus = "-unknown-";
    private String colour = "-unknown-";
    private String country = ("-unknown-")
    private int lifeexpectancy = 0;
    private boolean fur = false;
    private boolean swimming = false;
    private boolean wings = false;
    private boolean fly = false;
    private boolean fins = false;
    private boolean lung = false;
    private boolean running =false;
    private boolean gills = false;

    public Car(String name, String genus, String colour, int lifeexpectancy, boolean fur, boolean swimming, boolean wings, boolean fly, boolean fins, boolean lung, boolean running, boolean gills) {
        setName(name);
        setGenus(genus);
        setColour(colour);
        setCountry(country);
        setLifeexpectancy(lifeexpectancy);
        setFur(fur);
        setSwimming(swimming);
        setWings(wings);
        setFly(fly);
        setFins(fins);
        setLung(lung);
        setRunning(running);
        setGills(gills);
    }

    public void setName(String name) {
        if(name.length() =>30) {
            System.out.println("error: name to long");
        } else if(name.isBlank) {
            System.out.println("error: name blank");
        } else {
            this.name = name;
        }
    }

    public void setGenus(String genus) {
        if(genus.length() =>30 || genus.isBlank()) {
            System.out.println("error: name not valid");
        } else {
            this.genus = genus;
        }
    }

    public void setColour(String colour) {
        if(colour.isEmpty()) {
            System.out.println("error: no colour given");
        } else {
            this.colour = colour;
        }
    }

    public void setCountry(String country) {
        this.country = country.toUpperCase();
    }

    public void setLifeexpectancy(int lifeexpectancy) {
        if(lifeexpectancy =<0 || lifeexpectancy =>1000) {
            System.out.println("error: given number not valid");
        } else {
            this.lifeexpectancy = lifeexpectancy;
        }
    }

    public void setFur(boolean fur) {
        if(this.gills = true) {
            this.fur = false;
            System.out.println("error: set gills to false in order to set fur true");
        } else {
            this.fur = fur;
        }
    }

    public void setSwimming(boolean swimming) {
        this.swimming = swimming;
    }

    public void setWings(boolean wings) {
        if(this.fins = true || this.gills = true) {
            this.wings = false;
            System.out.println("error: set gills and fins false in order to set wings true");
        } else {
            this.wings = wings;
        }
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }

    public void setFins(boolean fins) {
        if(this.wings = true) {
            this.fins = false;
            System.out.println("error: set wings false in order to set fins true");
        } else {
            this.fins = fins;
        }
    }

    public void setLung(boolean lung) {
        if(this.gills = true) {
            this.lung = false;
            System.out.println("error: set gills false in order to set lung true");
        } else {
            this.lung = lung;
        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setGills(boolean gills) {
        if(this.fur = true || this.lung = true || this.wings = true) {
            this.gills = false;
            System.out.println("error: set fur, lung and wings false in order to set gills true");
        }
    }

    public String getName() {
        return this.name
    }

    public String getGenus() {
        return this.genus;
    }

    public String getColour() {
        return this.colour;
    }

    public String getCountry() {
        return this.country;
    }

    public int getLifeexpectancy() {
        return this.lifeexpectancy;
    }

    public boolean getFur() {
        return this.fur;
    }

    public boolean getSwimming() {
        return this.swimming;
    }

    public boolean getWings() {
        return this.wings;
    }

    public boolean getFly() {
        return this.fly;
    }

    public boolean getFins() {
        return this.fins;
    }

    public boolean getLung() {
        return this.lung;
    }

    public boolean getRunning() {
        return this.running;
    }

    public boolean getGills() {
        return this.gills;
    }

    public void printInfo() {
        System.out.println("=== Animal ===");
        System.out.println("name: " + this.name);
        System.out.println("genus: " + this.genus);
        System.out.println("colour: " + this.colour);
        System.out.println("country: " + this.country);
        System.out.println("lifeexpectancy: " + this.lifeexpectancy);
        if(this.fur = true) {
            System.out.println("this Animal has fur");
        }
        if(this.swimming = true) {
            System.out.println("this Animal can swim");
        }
        if(this.wings = true) {
            System.out.println("this Animal has wings");
        }
        if(this.fly = true) {
            System.out.println("this Animal can fly");
        }
        if(this.fins = true) {
            System.out.println("this Animal has fins");
        }
        if(this.lung = true) {
            System.out.println("this Animal has a lung");
        }
        if(this.running = true) {
            System.out.println("this Animal can run");
        }
        if(this.gills = true) {
            System.out.println("this Animal has gills");
        }
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*")
    }
}
