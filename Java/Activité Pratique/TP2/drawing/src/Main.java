import java.awt.Color;
import tp2.lib.Painter;

public class Main {

    // Test du paquet tp2.lib
    public static void testTP2() {
        Painter painter = new Painter(400, 400);
        painter.addLine(100, 100, 300, 100, Color.black);
        painter.addLine(300, 100, 300, 300, Color.black);
        painter.addLine(300, 300, 100, 300, Color.black);
        painter.addLine(100, 300, 100, 100, Color.black);
        painter.addPoint(100, 100, Color.red);
        painter.addPoint(300, 100, Color.red);
        painter.addPoint(100, 300, Color.red);
        painter.addPoint(300, 300, Color.red);
    }

    // Classe Point - Question 1 : Test de notre propre classe Point
    public static void classePointQuestion1() {
        Painter painter = new Painter(400, 400);
        Point p1 = new Point(100,100);
        Point p2 = new Point(300,100);
        Point p3 = new Point(300,300);
        Point p4 = new Point(100,300);
        p1.drawLine(p2, painter, Color.black);
        p2.drawLine(p3, painter, Color.black);
        p3.drawLine(p4, painter, Color.black);
        p4.drawLine(p1, painter, Color.black);
        p1.draw(painter, Color.red);
        p2.draw(painter, Color.red);
        p3.draw(painter, Color.red);
        p4.draw(painter, Color.red);
    }

    // Classe Point - Question 2 : Réécrivez le code ci-dessus en utilisant des boucles
    private static void classePointQuestion2() {
        Painter painter = new Painter(400, 400);
        Point[] points = {
                new Point(100, 100),
                new Point(300, 100),
                new Point(300, 300),
                new Point(100, 300)
        };

        for (int i = 0; i < points.length; i++) {
            points[i].drawLine(points[(i + 1) % points.length], painter, Color.black);
        }

        for (Point point : points) {
            point.draw(painter, Color.red);
        }
    }

    // Classe Point - Question 3 : Test de la méthode translate()
    public static void classePointQuestion3() {
        Painter painter = new Painter(400, 400);
        Point p1 = new Point(100, 100);
        Point p2 = p1.translate(200, 0);
        Point p3 = p2.translate(0, 200);
        Point p4 = p3.translate(-200, 0);
        p1.drawLine(p2, painter, Color.black);
        p2.drawLine(p3, painter, Color.black);
        p3.drawLine(p4, painter, Color.black);
        p4.drawLine(p1, painter, Color.black);
        p1.draw(painter, Color.red);
        p2.draw(painter, Color.red);
        p3.draw(painter, Color.red);
        p4.draw(painter, Color.red);
    }

    // Classe Point - Question 4 : Réécrivez le code ci-dessus en utilisant des boucles
    public static void classePointQuestion4() {
        Painter painter = new Painter(400, 400);
        Point[] points = new Point[4];
        points[0] = new Point(100, 100);
        points[1] = points[0].translate(200, 0);
        points[2] = points[1].translate(0, 200);
        points[3] = points[2].translate(-200, 0);

        for (int i = 0; i < points.length; i++) {
            points[i].drawLine(points[(i + 1) % points.length], painter, Color.black);
        }

        for (Point point : points) {
            point.draw(painter, Color.red);
        }
    }

    // Classe Point - Question 6 : Dessinez une roue
    public static void classePointQuestion6() {
        int nombreCotes = 10;
        double rayon = 150;
        double decalageRotation = 90;

        Painter painter = new Painter(400, 400);
        Point centre = new Point(200, 200);
        Point[] sommets = new Point[nombreCotes];
        // Premier sommet en haut du cercle
        Point debut = new Point(0, -rayon);

        // Génère les sommets du polygone
        for (int i = 0; i < nombreCotes; i++) {
            double angle = 360.0 / nombreCotes * i + decalageRotation;
            sommets[i] = debut.rotate(angle).translate(centre.x, centre.y);
        }

        // Dessine les côtés du polygone
        for (int i = 0; i < nombreCotes; i++) {
            sommets[i].drawLine(sommets[(i + 1) % nombreCotes], painter, Color.black);
        }

        // Dessine les diagonales du polygone
        for (int i = 0; i < nombreCotes; i++) {
            sommets[i].drawLine(sommets[(i + nombreCotes / 2) % nombreCotes], painter, Color.blue);
        }

        // Dessine les sommets
        for (Point vertex : sommets) {
            vertex.draw(painter, Color.red);
        }
    }


    // Tortue - Test 1 classe Turtle
    public static void test1ClasseTurtle() {
        Turtle turtle = new Turtle(400, 400);
        turtle.setColor(Color.red);
        turtle.setPenDown();
        turtle.moveForward(40);
        turtle.turnLeft(90);
        turtle.moveForward(40);
        turtle.turnLeft(90);
        turtle.moveForward(40);
        turtle.turnLeft(90);
        turtle.moveForward(40);
    }

    // Tortue - Test 2 classe Turtle
    public static void drawSquare(Turtle turtle, int size) {
        for (int i = 0; i < 4; i++) {
            turtle.moveForward(size);
            turtle.turnLeft(90);
        }
    }

    public static void test2ClasseTurtle() {
        Turtle turtle = new Turtle(800,600);
        turtle.setColor(Color.black);
        turtle.setPenDown();
        int n = 20;
        for (int i = 0; i < n; i++) {
            turtle.turnRight(360.0/n);
            drawSquare(turtle, 100);
        }
    }


    // Fractales - Question 4 : Test du programme
    public static void testFractales() {
        int width = 590, height = 580, nbIterations = 4;
        Turtle turtle = new Turtle(width, height);

        // Déplacement de la tortue en bas à gauche
        turtle.setPenUp();
        turtle.turnLeft(90);
        turtle.moveForward((double) width / 2 - 10);
        turtle.turnLeft(90);
        turtle.moveForward((double) height / 2 - 10);
        turtle.turnLeft(180);
        turtle.setPenDown();

        // Définition des règles
        Rule[] rules = {
                new Rule('X', "XAYAX+A+YAXAY-A-XAYAX"),
                new Rule('Y', "YAXAY-A-XAYAX+A+YAXAY")
        };
        SetOfRules setOfRules = new SetOfRules(rules);

        // Application des règles nbIterations fois
        String sequence = "X";
        for (int i = 0; i < nbIterations; i++) {
            sequence = setOfRules.apply(sequence);
        }

        // Dessin de la séquence par la tortue
        turtle.drawString(sequence, 7, 90);
    }


    public static void main(String[] args) {
        // testTP2();
        // classePointQuestion1();
        // classePointQuestion2();
        // classePointQuestion3();
        // classePointQuestion4();
        // classePointQuestion6();
        // test1ClasseTurtle();
        // test2ClasseTurtle();
        testFractales();
    }
}
