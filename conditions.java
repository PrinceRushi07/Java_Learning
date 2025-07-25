
import javax.lang.model.util.ElementScanner14;

public class conditions
{
    public static void main(String[] args) {
        
        int age = 13;

        if (age>=13 && age<=18)
        {
            System.out.println("teenager");
        }

        else if (age> 18 && age< 55)
        {
            System.out.println("adult");
        }

        else{
              System.out.println("child");
        }
    }
}