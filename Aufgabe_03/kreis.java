public class kreis {

      private double radius;

      public kreis() {
          this.radius = 5;
      }

      public kreis(double radius) {
        if(radius >= 1 && radius <= 50) {
            this.radius = radius; }
         else {
            System.out.println("Error: Radius ungültiger Wert");
        }
      }

      public double getRadius() {
          return this.radius;
      }

      public double setRadius(double radius) {
        if(radius >= 1 && radius <= 50) {
            this.radius = radius; }
         else {
            System.out.println("Error: Radius ungültiger Wert");
        }
          return this.radius;
      }

      public double berechnungUmfang() {
          double umfang = Math.PI * (radius * 2);
          return umfang;
      }

      public double berechnungFlaeche() {
          double umfang = Math.PI * (radius * radius);
          return umfang;
      }

      public void printInfo() {
          System.out.println("== Kreis ==");
          System.out.println("Radius: " + this.radius + "m");
          System.out.println("Umfang:" + +this.berechnungUmfang() + "m");
          System.out.println("Fläche:" + this.berechnungFlaeche() + "m^2");
      }
}
