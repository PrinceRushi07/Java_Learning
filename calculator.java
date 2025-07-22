import java.util.*;


public class calculator

{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("the give value of a is:");
      int a = sc.nextInt();
      System.out.print("the give value of b is:");
      int b = sc.nextInt();

      char operator = sc.next().charAt(0);
      System.out.println("ENTER OPERATOR:");
      switch(operator)
      {
        case '+' :System.out.println(a+b);
                    break;
        case '-' :System.out.println(a-b);
                    break;
        case '*' :System.out.println(a*b);
                    break;
        case '/' :System.out.println(a/b);
                      break;
        case '%' :System.out.println(a%b);

        default : System.out.println("not advanced");
      }

  }  
}
