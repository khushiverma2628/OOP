import java.util.Scanner;
 class check{
 public static void main(String[] args){

char ch;
  System.out.print("enter any character ");
  Scanner sc = new Scanner(System.in);
 ch=sc.next().charAt(0);
if(ch=='a' || ch=='e' || ch== 'i' || ch== 'o' || ch== 'u')
{
  System.out.print("vowel");
}
 
else {
 System.out.print("constant");

}
}

}