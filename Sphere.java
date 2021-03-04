public class Sphere {
    private double radius;
    private double height;

    Sphere(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    /*
    * Create a method that computes the volume of the sphere
    * @param double r
    * @return double sphere volume
    */
    public double volume(double radius) {
        double output = (4 / 3) * Math.PI  * Math.pow(radius, 3);
        return output;
    }

    /*
    * Create a method that computes the surface of a sphere
    * @param double r
    * @return double sphere surface
    */
    public double surface(double radius) {
        double output = 4 * Math.PI * Math.pow(radius, 2);
        return output;
    }
}
