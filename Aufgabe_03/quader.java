public class quader {

    private int laenge;
    private int breite;
    private int hoehe;
    private int dichte;

    public quader(int laenge, int breite, int hoehe, int dichte) {
        if(laenge >= 1 && laenge <= 100) {
            this.laenge = laenge; }
         else {
            System.out.println("Error: Länge ungültiger Wert");
        }
        if (breite >= 1 && breite <= 130) {
            this.breite = breite; }
         else {
            System.out.println("Error: Breite ungültiger Wert");
        }
        if (hoehe >= 1 && hoehe <= 200) {
            this.hoehe = hoehe; }
         else {
            System.out.println("Error: Höhe ungültiger Wert");
        }
         if (dichte >= 1 && dichte <= 2000) {
            this.dichte = dichte; }
         else {
            System.out.println("Error: Dichte ungültiger Wert");
        }
    }

    public int getLaenge() {
        return this.laenge;
    }

    public int getBreite() {
        return this.breite;
    }

    public int getHoehe() {
        return this.hoehe;
    }

    public int getDichte() {
        return this.dichte;
    }

    public void setBreite(int breite) {
        if (breite >= 1 && breite <= 130) {
            this.breite = breite; }
        else {
            System.out.println("Error: Breite ungültiger Wert");
        }
    }

    public void setLaenge(int laenge) {
        if(laenge >= 1 && laenge <= 100) {
            this.laenge = laenge; }
        else {
            System.out.println("Error: Länge ungültiger Wert");
        }
    }

    public void setHoehe(int hoehe) {
        if (hoehe >= 1 && hoehe <= 200) {
            this.hoehe = hoehe; }
        else {
            System.out.println("Error: Höhe ungültiger Wert");
        }
    }

    public void setDichte(int dichte) {
        if (dichte >= 1 && dichte <= 2000) {
            this.dichte = dichte; }
        else {
            System.out.println("Error: Dichte ungültiger Wert");
        }
    }

    public int berechnungOberflaeche() {
        int oberflaeche = 2 * laenge * breite + 2 * breite * hoehe + 2 * laenge * hoehe;
        return oberflaeche;
    }

    public int berechnungVolumen() {
        int volumen = laenge * breite * hoehe;
        return volumen;
    }

    public int berechnungMasse() {
        int masse = hoehe * berechnungVolumen();
        return masse;
    }

    public void printInfo() {
        System.out.println("== Quader ==");
        System.out.println("Länge: " + this.laenge + "m");
        System.out.println("Breite: " + this.breite + "m");
        System.out.println("Höhe: " + this.hoehe + "m");
        System.out.println("Dichte: " + this.dichte + "m");
        System.out.println("Oberfläche: " + this.berechnungOberflaeche() + "m");
        System.out.println("Volumen:" + this.berechnungVolumen() + "m");
        System.out.println("Masse:" + this.berechnungMasse() + "m");
    }
}

