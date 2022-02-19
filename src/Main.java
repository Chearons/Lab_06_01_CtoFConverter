import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double c,f;
        System.out.println("Enter temperature in Celsius: ");
        c = in.nextDouble();

        if(c < -100)
        {
            System.out.println("ERROR: Bad Input!!");
        }
        else
        {
            if(c==0)
                System.out.println("It is at freezing point!");
            else if(c==100)
                System.out.println("It is at boiling point!!");
            f= (c*9)/5 + 32;
            System.out.println(c +" degrees celsius is " +f + " degrees Fahrenheit");
        }




    }
}

