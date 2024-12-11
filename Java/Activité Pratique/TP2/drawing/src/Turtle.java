import java.awt.Color;
import tp2.lib.Painter;
import tp2.lib.Tools;

public class Turtle {
    Color penColor;
    double angleDirection;
    Point position;
    boolean penIsDown;
    Painter painter;

    public Turtle(int width, int height) {
        this.penColor = null;
        this.angleDirection = 90;
        this.painter = new Painter(width, height);
        this.penIsDown = false;
        this.position = new Point((double) width / 2, (double) height / 2);
    }

    public void moveForward(double distance) {
        Tools.sleep(5);

        Point movement = new Point(0, -distance);
        Point rotation = movement.rotate(this.angleDirection);
        Point next = this.position.translate(rotation.x, rotation.y);

        if (this.penIsDown) {
            this.position.drawLine(next, this.painter, this.penColor);
        }

        this.position = next;
    }

    public void setColor(Color color) {
        this.penColor = color;
    }

    public void turnLeft(double angle) {
        this.angleDirection += angle;
    }

    public void turnRight(double angle) {
        this.angleDirection -= angle;
    }

    public void setPenDown() {
        this.penIsDown = true;
    }

    public void setPenUp() {
        this.penIsDown = false;
    }

    // Fractales - Question 1 : Ajoutez une méthode drawString()
    public void drawString(String sequence, double length, double angle) {
        for (char car : sequence.toCharArray()) {
            if (car == 'A') {
                this.moveForward(length);
            }

            if (car == '+') {
                this.turnRight(angle);
            }

            if (car == '-') {
                this.turnLeft(angle);
            }
        }
    }
}
