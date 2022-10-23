public interface Problem1 {
    /*Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter. Create 2 classes Circle &
    Square that implements functionality defined in the Shape Interface. Test your code.*/
    void calculateArea();
    void calculatePerimiter();
}
class Circle implements Problem1 {
    double radius = 5;
    double p = 3.14;

    public void calculateArea() {
        System.out.println("way of difinding area of circle is " + p * radius * radius);
    }

    public void calculatePerimiter() {
        System.out.println("way of difinding perimiter of circle is " + 2 * radius * p);
    }
}
    class Square implements Problem1 {
        int lenthside=7;
        public void calculateArea(){
            System.out.println("way of difinding area of square is "+lenthside*lenthside);
        }
        public void calculatePerimiter(){
            System.out.println("way of difinding perimiter of square is "+lenthside*4);
        }}
        class tester34 {
            public static void main(String[] args) {
                Problem1[] shapeTask1 = {new Circle(), new Square()};
                for (Problem1 s : shapeTask1) {
                    s.calculateArea();
                    s.calculatePerimiter();
                }
            }

        }
