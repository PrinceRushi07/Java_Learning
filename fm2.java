import java.util.*;
public class fm2 
{
    public static int calculatesum(int num1,int num2)
    {
      int sum = num1 + num2;
       System.out.println("sum is:"+ sum);
      return sum ;
     
     
        

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first value:");
        int a= sc.nextInt();
        System.out.println("enter the second value:");
        int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println("sum is:"+ sum);
       int sum = calculatesum(a,b);
    }
}
