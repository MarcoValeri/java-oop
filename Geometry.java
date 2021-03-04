import java.util.Scanner;

public class Geometry {
    // Instances
    private double r;
    private double h;

    // Constructor
    public Geometry() {
        r = 0;
        h = 0;
    }

    /*
    * Create a method that computes the volume of the sphere
    * @param double r
    * @return double sphere volume
    */
    public static double sphereVolume(double r) {
        double output = (4 / 3) * Math.PI  * Math.pow(r, 3);
        return output;
    }

    /*
    * Create a method that computes the surface of a sphere
    * @param double r
    * @return double sphere surface
    */
    public static double sphereSurface(double r) {
        double output = 4 * Math.PI * Math.pow(r, 2);
        return output;
    }

    /*
    * Create a method that computes the volume of a cylinder
    * @param double r and double h
    * @return double volume of the cylinder
    */
    public static double cylinderVolume(double r, double h) {
        double output = Math.PI * Math.pow(r, 2) * h;
        return output;
    }

    /*
    * Create a method that computes the surface of the cylinder
    * @param double r and double h
    * @return double cylinder's surface
    */
    public static double cylinderSurface(double r, double h) {
        double output = Math.PI * Math.pow(r, 2);
        return output;
    }

    /*
    * Create a method that computes the cone volume
    * @param double r and double h
    * @return double cone's volume
    */
    public static double coneVolume(double r, double h) {
        double output = (2 / 3) * Math.PI * Math.pow(r, 3);
        return output;
    }

    /*
    * Create a method that computes the cone surface
    * @param double r and double h
    * @return double cone's surface
    */
    public static double coneSurface(double r, double h) {
        double output = (1 + Math.sqrt(5)) * Math.PI * Math.pow(r, 2);
        return output;
    }

    public static void main(String[] args) {

        System.out.print("Please, enter the radius: ");
        Scanner input_r = new Scanner(System.in);
        double radius = input_r.nextDouble();

        System.out.print("Please, enter the height: ");
        Scanner input_h = new Scanner(System.in);
        double height = input_h.nextDouble();

        System.out.println("The sphere's volume is: " + sphereVolume(radius));
        System.out.println("The sphere's surface is: " + sphereSurface(radius));
        System.out.println("The cylinder's volume is: " + cylinderVolume(radius, height));
        System.out.println("The cylinder's surface is: " + cylinderSurface(radius, height));
        System.out.println("The cone's volume is: " + coneVolume(radius, height));
        System.out.println("The cone's surface is: " + coneSurface(radius, height));

        input_r.close();
        input_h.close();
    }

}
