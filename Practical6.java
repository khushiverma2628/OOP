import java.util.Scanner;
class Practical6{
public static void main(String[] args){
Scanner sc =  new Scanner(System.in);
System.out.print("enter an 5 Digit no.:");
String a = sc.next();
System.out.print("your new 5 digit no.:");

for(int i=0; i<a.length();i++){
int digit = a.charAt(i)-'0';
digit =  digit+1;

if(digit == 10){
   digit = 0;

}
System.out.print("digit");

}
}

}