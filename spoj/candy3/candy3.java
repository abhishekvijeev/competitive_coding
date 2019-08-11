import java.util.Scanner;

public class candy3
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t;
        long n, sum;

        t = sc.nextInt();
        n = sum = 0;
        while(t > 0)
        {
            n = sc.nextLong();
            sum = 0;
            for(long i = 0; i < n; ++i)
            {
                sum = sum + (sc.nextLong() % n);
            }
            if((sum % n) == 0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            --t;
        }
    }
}