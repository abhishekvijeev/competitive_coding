import java.util.Scanner;

public class hangover
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        float c, sum;
        int i;

        c = sc.nextFloat();
        i = 0;
        while(c != 0)
        {
            i = 2;
            sum = 0;
            while(sum < c)
            {
                sum += (1.0 / i);
                ++i;
            }
            System.out.println((i - 2) + " card(s)");
            c = sc.nextFloat();
        }
    }
}