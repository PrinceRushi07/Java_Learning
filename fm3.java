import java.util.*;
public class fm3
{
    public static int multiply(int num1,int num2)
    {
        int product = num1*num2;
        return product;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        int product = multiply(a,b);
        System.out.println("the multiplication is:"+product);
    }
}