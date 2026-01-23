class Rectangle {

    double width, height;
    Rectangle() {
        width = 1;
        height = 1;
    }
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    void getArea() {
        System.out.println("Area of Rectangle: " + (width * height));
    }
    void getPerimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (width + height)));
    }
}
 class main{
    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle();     
        Rectangle obj2 = new Rectangle(10.0 , 20.0);

        obj1.getArea();
        obj2.getPerimeter();

        
    }
}