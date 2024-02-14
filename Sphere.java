//** Programmers:  Wil and Sean
//* Course:  CS 212
//* Due Date: feb. 14, 2024
//* Lab Assignment: lab 4
//* Problem Statement: see if spheres overlap
//* Data In:none
//* Data Out:if spheres overlap
//* Credits: N/A
//*/

class Sphere {

    private double radius;
    private double x;
    private double y;
    private double z;

    //Default constructor
    public Sphere() {
        //Initialize default values
        this.radius = 0.0;
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
    }
    //Constructor
    public Sphere(double r, double x, double y, double z) {
        //Initialize radius and coordinates based on user input
        this.radius = r;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getSurfaceArea() {
        //Calculate surface area of the sphere and return
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
    public double getVolume() {
        //Calculate the volume of the sphere and return
        return (4/3) * Math.PI * Math.pow(this.radius, 3);
    }
    public double getDist(double x, double y, double z) {
        //Calculate the distance of current sphere and point
        return Math.sqrt(Math.pow((this.x-x), 2) + Math.pow((this.y-y), 2) + Math.pow((this.z-z), 2));
    }

    public boolean overlap(Sphere s){
        //finds distance between 2 spheres
        double totalDistance = getDist(s.x,s.y,s.z);
        //finds the combined value of radius
        double totalRadius = this.radius+s.radius;
        //checks to see if distance between 2 planets is greater than combined radius'
        if(totalDistance>totalRadius){
            return false;
        }
        else{
            return true;
        }
    }

    public double getX() {
        return x;
    }
    public double getRadius() {
        return radius;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }


}
