/**
 * This program create 3 objects: 1 Point object and 2 rectangle objects.
 */
package ClassesAndObjects.Objects;

public class CreateObjectDemo {
    public static void main(String[] args) {

        //  Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        // Display rectOne's width, height, and area.
        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + rectOne.getArea());

        // Set rectTwo's position.
        rectTwo.origin = originOne;

        // Display rectTwo's position.
        System.out.println("X position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y position of rectTwo: " + rectTwo.origin.y);

        // Move rectTwo and display's its new position.
        rectTwo.move(40, 72);
        System.out.println("X position of rectTwo: " + rectTwo.origin.x);
        System.out.println("Y position of rectTwo: " + rectTwo.origin.y);
    }
}

