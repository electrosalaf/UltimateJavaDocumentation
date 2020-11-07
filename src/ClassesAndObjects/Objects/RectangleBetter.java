/**
 * This program use the keyword this to reference the current object within an instance method or a constructor.
 * This keyword is used when a field is shadowed by a method or a constructor parameter.
 */
package ClassesAndObjects.Objects;

public class RectangleBetter {
    private int x, y;
    private int width, height;

    public RectangleBetter() {
        this(0, 0, 1, 1);
    }
    public RectangleBetter(int x, int y, int width) {
        this.x = x;
        this.x = y;
        this.width = 0;
    }

    public RectangleBetter(int width, int height) {
        this(0, 0, width, height);
    }
    public RectangleBetter(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getArea() {
      return (width * height);
    };
}
