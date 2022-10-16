public class Pflanze {

    private String name;
    private int hoehe;
    private boolean bluete;
    private boolean winterfest;
    private int alter;

    public Pflanze() {
        setName("Hagebutte");
        setHoehe(3);
        setBluete(true);
        setWinterfest(true);
        setAlter(2);
    }

    public Pflanze(String name, int hoehe, boolean bluete, boolean winterfest, int alter) {
        setName(name);
        setHoehe(hoehe);
        setBluete(bluete);
        setWinterfest(winterfest);
        setAlter(alter);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoehe(int hoehe) {
        if(hoehe >0 && hoehe <=200) {
            this.hoehe = hoehe;
        } else {
            System.out.println("ungueltiger Wert");
        }
    }

    public void setBluete(boolean bluete) {
        this.bluete = bluete;
    }

    public void setWinterfest(boolean winterfest) {
            this.winterfest = winterfest;
    }

    public void setAlter(int alter) {
        if(alter >0 && alter <2000) {
            this.alter = alter;
        } else {
            System.out.println("ungueltiger Wert");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getHoehe() {
        return this.hoehe;
    }

    public boolean getBluete() {
        return this.bluete;
    }

    public int getWinterfest() {
        return this.winterfest;
    }

    public int getAlter() {
        return this.alter;
    }

    public void printInfo() {
        System.out.println("===Pflanze===");
        System.out.println(this.name);
        System.out.println(this.hoehe + "m");
        System.out.println(this.bluete);
        System.out.println(this.winterfest);
        System.out.println(this.alter + "Jahre");
    }
}
