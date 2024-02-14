//** Programmers:  Wil and Sean
//* Course:  CS 212
//* Due Date: feb. 14, 2024
//* Lab Assignment: lab 4
//* Problem Statement: see if spheres overlap
//* Data In:none
//* Data Out:if spheres overlap
//* Credits: N/A
//*/

        import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //initializes new sphere with x, y , z, radius
        Sphere sun = new Sphere(0.0,0.0,0.0, 43.26);
        Sphere earth = new Sphere(26.0,42.0,79.0,0.395);
        Sphere planetX = new Sphere(25.3, 43.1,77.8,1.4);
        //prints out surface area
        System.out.println("Surface area of the sun: "+sun.getSurfaceArea());
        System.out.println("Surface area of the earth: "+earth.getSurfaceArea());
        System.out.println("Surface are of planetX: "+planetX.getSurfaceArea());
        //prints out volume
        System.out.println("Volume of sun: "+sun.getVolume());
        System.out.println("Volume of earth: "+earth.getVolume());
        System.out.println("Volume of planetX: "+planetX.getVolume());
        //checks to see if earth and sun collide
        if(sun.overlap(earth)){
            System.out.println("The sun and earth do not overlap.");
        }
        else{
            System.out.println("The sun and earth overlap.");
        }
        //checks to see if sun and planet x collide
        if(sun.overlap(planetX)){
            System.out.println("The sun and planetX do not overlap.");
        }
        else{
            System.out.println("The sun and planetX overlap.");
        }
        //checks to see if earth and planet x collide
        if(earth.overlap(planetX)){
            System.out.println("The planetX and earth do not overlap.");
        }
        else{
            System.out.println("The planetX and earth overlap.");
        }


    }
    //

}

