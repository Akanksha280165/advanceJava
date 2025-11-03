import java.util.Scanner;

public class TernaryOperator
{
 public static void main(String args[])
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("enter the marks of student");
  int marks=sc.nextInt();
  sc.nextLine();
  
  String result=(marks>=85)? "pass with first division":"work harder";
  System.out.println(result);
  
  
 }
}