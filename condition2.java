
import javax.lang.model.util.ElementScanner14;

public class condition2
{
    public static void main(String args[])
    {
        int a = 1;
        int b = 3;
        int c = 6;

        if(a>b && a>c)
        {
            System.out.println("the largest of 3 is a");

        }

        else if(b>a && b>c)
        {
            System.out.println("the largest of 3 is b");
        }

        else
        {
          System.out.println("the largest of 3 is c");
        }
    }
}