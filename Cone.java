public class Cone {
    private double radius;
    private double height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    /*
    * Create a method that computes the cone volume
    * @param double radius and double height
    * @return double cone's volume
    */
    public static double volume(double radius, double height) {
        double output = (2 / 3) * Math.PI * Math.pow(radius, 3);
        return output;
    }

    /*
    * Create a method that computes the cone surface
    * @param double radius and double height
    * @return double cone's surface
    */
    public static double surface(double radius, double height) {
        double output = (1 + Math.sqrt(5)) * Math.PI * Math.pow(radius, 2);
        return output;
    }

}
