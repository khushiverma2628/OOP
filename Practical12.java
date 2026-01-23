class point {
  int x; 
  int y;
  public point(){
     x = 5; 
     y = 5;
}

 public point(int x,int y){
 this.x = x;
 this.y = y;
}

  public point (point p){
    this.x = p.x;
    this.y = p.y;

}
  public void display() {
  System.out.println("Point (" + x + " , " + y + ")");

     }
   public static void main(String[] args) {
  
  point p1 = new point();
  System.out.print("Default Constructor -> ");
  p1.display();

 point p2 = new point(10,20);
 System.out.print("Parameterized Constructor -> ");
 p2.display();

 point p3 = new point(p2);
 System.out.print("Copy Constructor -> ");
 p3.display();

}
  }