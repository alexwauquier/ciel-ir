import java.awt.Color;
import tp2.lib.Painter;

// Classe Point - Question 1 : Écrivez la classe Point
public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Painter painter, Color color) {
        painter.addPoint(this.x, this.y, color);
    }

    public void drawLine(Point p, Painter painter, Color color) {
        painter.addLine(this.x, this.y, p.x, p.y, color);
    }

    // Question 3 : Ajoutez une méthode translate()
    public Point translate(double dx, double dy) {
        return new Point(this.x + dx, this.y + dy);
    }

    // Question 5 : Ajoutez une méthode rotate()
    public Point rotate(double angle) {
        double alpha = (Math.PI * angle ) / 180;
        double x = this.x * Math.cos(alpha) - this.y * Math.sin(alpha);
        double y = this.x * Math.sin(alpha) + this.y * Math.cos(alpha);

        return new Point(x, y);
    }
}
