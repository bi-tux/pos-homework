public class rechteck {

    private int laenge;
    private int breite;

    public rechteck() {
        this.laenge = 2;
        this.breite = 4;
    }

    public rechteck(int laenge, int breite) {
        if(laenge >= 1 && laenge <= 100) {
            this.laenge = laenge; }
         else {
            System.out.println("Error: Länge ungültiger Wert");
        }
        if (breite >= 1 && breite <= 120) {
            this.breite = breite; }
         else {
            System.out.println("Error: Breite ungültiger Wert");
        }
    }

    public int getLaenge() {
        return this.laenge;
    }

    public int getBreite() {
        return this.breite;
    }

    public void setBreite(int breite) {
        if(breite >= 1 && breite <= 120) {
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

    public int berechnungUmfang() {
        int umfang = 2 * (laenge + breite);
        return umfang;
    }

    public int berechnungFlaeche() {
        int flaeche = (laenge * breite);
        return flaeche;
    }

    public void printInfo() {
        System.out.println("== Rechteck ==");
        System.out.println("Länge: " + this.laenge + "m");
        System.out.println("Breite: " + this.breite + "m");
        System.out.println("Umfang:" + this.berechnungUmfang() + "m");
        System.out.println("Fläche:" + this.berechnungFlaeche() + "m^2");
    }
}
