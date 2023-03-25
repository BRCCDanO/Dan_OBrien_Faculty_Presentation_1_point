import java.util.ArrayList;
import javax.swing.JFrame;
public class Main {

    // Main method, the entry point of the program
    public static void main(String[] args) {

        // Instantiate 5 new Point objects with various x and y values
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 6);
        Point p4 = new Point(7, 8);
        Point p5 = new Point(9, 10);
        Point p6 = new Point(12, 15);

        // Define an ArrayList of Point objects & add Point instances to it
        ArrayList<Point> listPoints = new ArrayList<>();
        listPoints.add(p1);
        listPoints.add(p2);
        listPoints.add(p3);
        listPoints.add(p4);
        listPoints.add(p5);
        listPoints.add(p6);

// Use a for-each loop to iterate through ArrayList, then print x & y values
        for (Point point : listPoints) {
            System.out.println("x: " + point.getX() + ", y: " + point.getY());

            // Create new JFrame & add the GraphPane to it
            JFrame frame = new JFrame("Point Plotter");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new GraphPane(listPoints));
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }
}