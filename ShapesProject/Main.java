public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(7),
            new Rectangle(5, 4)
        };

        double total = 0;
        for (Shape s : shapes) {
            total += s.getArea();
        }

        System.out.println(total);
    }
}