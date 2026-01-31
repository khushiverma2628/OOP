class Rectangle{
  double width;
double height;

public double getArea() {
  return width * height;

}
public double getPerimeter() {
 return 2 *(width + height);
 
}

public static void main(String[] ars){
      Rectangle r1 = new Rectangle();
    r1.width = 4;
    r1.height = 40;
 
Rectangle r2 = new Rectangle();
r2.width = 3.5;
r2.height = 5.9;
System.out.println("Rectangle 1:");
System.out.println("Width = " + r1.width);
System.out.println("Height = " + r1.height);
System.out.println("Area = " + r1.getArea());
System.out.println("Perimeter = " + r1.getPerimeter());

System.out.println();

System.out.print("Rectangle 2:");
System.out.println("Width = " + r2.width);
System.out.println("Height = " + r2.height);
System.out.println("Area = " + r2.getArea());
System.out.println("Perimeter = " + r2.getPerimeter());

  if (r1.getArea() > r2.getArea()){
    System.out.println("Rectangle 1 has larger area.");
} else if (r1.getArea() < r2.getArea()){
  System.out.println("Rectangale 2 has larger area.");
} else {
System.out.println("Both have equal area.");

       }
    }


}










 