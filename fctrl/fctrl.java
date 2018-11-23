import java.util.Scanner;

public class fctrl
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t, fives;

        t = sc.nextInt();
        fives = 0;

        while(t > 0)
        {
            int n = sc.nextInt();
            fives = 0;

            for(long i = 5; i <= n; i *= 5)
            {
                fives += (n / i);
            }
            System.out.println(fives);
            --t;
        }
    }
}