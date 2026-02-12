public class Lecture {
    public static void main(String[] args) {

        Point a = new Point(7, 9);
        Point b = new Point(8, 5);

        Segment s = new Segment(a, b);

        System.out.println("Length: " + s.length());
    }
}
