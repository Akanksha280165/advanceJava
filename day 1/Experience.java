import java.util.Scanner;

public class Experience
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the years of experience");
  int exp=sc.nextInt();
   
  System.out.println("The designation based on experience is");
   
  
  if(exp>0 && exp<=2)
  {
   System.out.println("Associate Engineer");
  }
  
  else if(exp>2 && exp<=5)
  {
   System.out.println("Software Engineer");
   
  }
  
  else if(exp>5 && exp<=7)
  {
   System.out.println("Sr Software Engineer");
   
  }
  
  else
  {
   System.out.println("Manager");
   
  }
 }
}