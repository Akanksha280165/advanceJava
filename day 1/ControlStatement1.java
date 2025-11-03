import java.util.Scanner;

public class ControlStatement1
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the age");
  int age=sc.nextInt();
  
  if(age<18)
  {
   System.out.println("applicant is NOT APPLICABLE");
  }
 
 else if(age>=18 && age<25)
  {
  
   System.out.println("applicant is eligible for marriage");
  
  }
  
  else if(age>=25 && age<34)
  {
  
   System.out.println("applicant is eligible for premium package");
  
  }
  
  else 
  {
  
   System.out.println("applicant is eligible for VIP package");
  
  }
  
  
 }
}