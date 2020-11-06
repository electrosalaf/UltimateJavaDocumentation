/**
 * Each constructor let us provide initial values for rectangle's origin, height, and width, using both primitive and reference types.
 *
 */
package ClassesAndObjects.Objects;

public class Rectangle {
    public int height = 0;
    public int width = 0;
    public Point origin;

    // Four constructors
    public Rectangle() {
        origin = new Point(0, 0);
    }
    public Rectangle(Point p) {
        origin = p;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // A method for moving the rectangle.
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // A method for computing the area of the rectangle.
    public int getArea() {
        return width * height;
    }
}
