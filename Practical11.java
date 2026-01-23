class Time{
 int hours;
int minutes;
 public void setTime(int h, int m){
     hours = h;
     minutes = m;
}
  public void displayTime() {
    System.out.print(hours + " hours " + minutes + "minutes");
   }
public void addTime(Time t1, Time t2){
int totalMinutes = t1.minutes + t2.minutes;
int extraHours = totalMinutes / 60;
int finalMinutes = totalMinutes % 60;

int totalHours = t1.hours + t2.hours + extraHours;

   this.hours = totalHours;
   this.minutes = finalMinutes;
}
   public static void main(String[] args){
     Time time1 = new Time();
     Time time2 = new Time();
     Time result = new Time();
  
  time1.setTime(2,45);
  time2.setTime(1, 30);

result.addTime(time1, time2);
System.out.println("Time 1: ");
time1.displayTime();

System.out.println("Time 2: ");
time2.displayTime();

System.out.println("Sum: ");
result.displayTime();
  }

   }



 
