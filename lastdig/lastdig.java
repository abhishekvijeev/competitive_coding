import java.util.Scanner;

public class lastdig
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t, a = 0, b = 0, index = 0, res = 0;
        t = sc.nextInt();

        while(t > 0)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            if(b == 0)
            {
                res = 1;
            }
            else if((b % 4) == 0)
            {
                res = (int)Math.pow(a, 4) % 10;
            }
            else
            {
                res = (int)Math.pow(a, (b % 4)) % 10;
            }
            System.out.println(res);
            --t;
        }
    }
}