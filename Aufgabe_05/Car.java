public class Car {
    private String brand;
    private String typ;
    private int yearofconstruction;
    private boolean fullwheeldrive;
    private String colour;
    private String licenseplate;

    public Car() {
        this.brand = ("unknown");
        this.typ = ("unknown");
        this.yearofconstruction = 1900;
        this.fullwheeldrive = false;
        this.colour = ("unknown");
        this.licenseplate = ("unknown");
    }

    public Car(String brand, String typ, int yearofconstruction, boolean fullwheeldrive, String colour, String licenseplate) {
        setBrand(brand);
        setTyp(typ);
        setYearofconstruction(yearofconstruction);
        setFullwheeldrive(fullwheeldrive);
        setColour(colour);
        setLicenseplate(licenseplate);
    }

    public void setBrand(String brand) {
        if(brand.equals("audi") || brand.equals("bmw") || brand.equals("tesla")) {
        this.brand = brand.toUpperCase();
        } else {
            System.out.println("error: brand not suported");
        }
    }

    public void setTyp(String typ) {
        if(typ.length() <3) {
            System.out.println("error: name to short");
        } else if(typ.length() >20) {
            System.out.println("error: name to long");
        } else {
            this.typ = typ;
        }
    }

    public void setYearofconstruction(int yearofconstruction) {
        if(yearofconstruction <2012 && yearofconstruction >2022) {
            System.out.println("error: value not accepted");
        } else if(yearofconstruction ==2016) {
            System.out.println("error: value not accepted");
        } else {
            this.yearofconstruction = yearofconstruction;
        }
    }

    public void setFullwheeldrive(boolean fullwheeldrive) {
        this.fullwheeldrive = fullwheeldrive;
    }

    public void setColour(String colour) {
        if(colour.equals("green") || colour.equals("black") || colour.equals("red") || colour.equals("blue") || colour.equals("white")) {
            this.colour = colour;
        } else {
            System.out.println("error: colour not suported");
        }
    }

    public void setLicenseplate(String licenseplate) {
        if(licenseplate.startsWith("W-") || licenseplate.startsWith("MD-")) {
            this.licenseplate = licenseplate;
        } else {
            System.out.println("error: licenseplate has to start with eigther 'W-' or 'MD-'");
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public String getTyp() {
        return this.typ;
    }

    public int getYearofconstruction() {
        return this.yearofconstruction;
    }

    public boolean getFullwheeldrive() {
        return this.fullwheeldrive;
    }

    public String getColour() {
        return this.colour;
    }

    public String getLicenseplate() {
        return this.licenseplate;
    }

    public void printInfo() {
    System.out.println("=== Car ===");
    System.out.println("Brand: " + this.brand);
    System.out.println("Typ: " + this.typ);
    System.out.println("Year of construction: " + this.yearofconstruction);
    if(this.fullwheeldrive == true) {
    System.out.println("suports full-wheel drive");
    }
    System.out.println("Colour: " + this.colour);
    System.out.println("licenseplate: " + this.licenseplate);
    }
}
