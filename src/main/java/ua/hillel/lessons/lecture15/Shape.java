package ua.hillel.lessons.lecture15;

public class Shape {
    private String color;
    private String name = "default name";

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    public static void print(Shape shape) {
        System.out.println(shape);
    }

    public static class Edge {
        private int length;
        private String color;

        public Edge(int length, String color) {
//            super.name = "test";
            this.length = length;
            this.color = color;
            print(new Shape(color));
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "length=" + length +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
