public class Berg {

    private String name;
    private int hoehe;
    private boolean skipiste;
    private int wanderrouten;

    public Berg() {
        setName("Bisamberg");
        setHoehe(358);
        setSkipiste(true);
        setWanderrouten(12);
    }

    public Berg(String name, int hoehe, boolean skipiste, int wanderrouten) {
        setName(name);
        setHoehe(hoehe);
        setSkipiste(skipiste);
        setWanderrouten(wanderrouten);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHoehe(int hoehe) {
        if(hoehe >= 100 && hoehe <= 8849) {
            this.hoehe = hoehe;
        } else {
            System.out.println("ungueltiger Wert");
        }
    }

    public void setSkipiste(boolean skipiste) {
        this.skipiste = skipiste;
    }

    public void setWanderrouten(int wanderrouten) {
        if(wanderrouten >= 1 && wanderrouten <= 40) {
            this.wanderrouten = wanderrouten;
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

    public boolean getSkipiste() {
        return this.skipiste;
    }

    public int getWanderrouten() {
        return this.wanderrouten;
    }

    public void printInfo() {
        System.out.println("===Berg===");
        System.out.println(this.name);
        System.out.println(this.hoehe + "m");
        System.out.println(this.skipiste);
        System.out.println(this.wanderrouten);
    }
}
