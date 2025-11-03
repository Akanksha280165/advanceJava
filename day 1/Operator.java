import java.util.Scanner;

public class Operator
{
 public static void main(String[] args)
 {
 
  int result=0;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the  first number");
  int num1= sc.nextInt();
  
  System.out.println("enter the  second number");
  int num2= sc.nextInt();
  sc.nextLine();
  
  System.out.println("enter the operation to perform");
  String s=sc.nextLine();
  
  if(s.equals("add"))
  {
    result=num1+num2;
    System.out.println("the result of sum is "+ result);
  }
  
   else if(s.equals("subtract"))
  {
    result=num1-num2;
    System.out.println("the result of sum is "+ result);
  }
  
  else if(s.equals("multiply"))
  {
    result=num1*num2;
    System.out.println("the result of sum is "+ result);
  }
  
 else if(s.equals("divide"))
  {
    result=num1/num2;
    System.out.println("the result of sum is "+ result);
  }
  
  
  
 }
}