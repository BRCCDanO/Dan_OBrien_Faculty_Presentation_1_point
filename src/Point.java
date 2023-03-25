import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;
public class Point {

    // Create 2 private integer instance variables, x and y
    private int x;
    private int y;

    // Our default constructor which initializes x and y as 0
    public Point() {
        x = 0;
        y = 0;
    }
    // Overloaded constructor taking 2 integer arguments & initializes x and y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    // Set and get for x, which sets the value of x to the provided argument
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    // Set and get for x, which sets the value of y to the provided argument
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}
// Create class GraphPane
class GraphPane extends JPanel {
    private ArrayList<Point> points;
    public GraphPane(ArrayList<Point> points) {
        this.points = points;
        setPreferredSize(new Dimension(300, 300));
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
// Draw the points on the graph
        for (Point point : points) {
            int x = point.getX() * 20;
            int y = getHeight() - point.getY() * 20;
            g.setColor(Color.blue);
            g.fillOval(x, y, 10, 10);
        }
    }
}