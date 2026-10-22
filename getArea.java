public class getArea {

    interface Shape {
        double getArea();
    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle implements Shape {
        private double w;
        private double h;

        public Rectangle(double w, double h) {
            this.w = w;
            this.h = h;
        }

        @Override
        public double getArea() {
            return w * h;
        }
    }

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