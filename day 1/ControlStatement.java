import java.util.Scanner;

public class ControlStatement
{
 public static void main(String []args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the age of applicant");
  int age= sc.nextInt();
  
  if(age>18)
  {
  System.out.println("applicant is eligible for voting");
  }
 else{
  System.out.println("applicant not eligible for voting");
 }
  
 }
}