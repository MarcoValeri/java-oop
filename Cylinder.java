public class Cylinder {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /*
    * Create a method that computes the volume of a cylinder
    * @param double radius and double height
    * @return double volume of the cylinder
    */
    public double volume(double r, double h) {
        double output = Math.PI * Math.pow(radius, 2) * height;
        return output;
    }

    /*
    * Create a method that computes the surface of the cylinder
    * @param double radius and double height
    * @return double cylinder's surface
    */
    public double cylinderSurface(double radius, double height) {
        double output = Math.PI * Math.pow(radius, 2);
        return output;
    }

}
