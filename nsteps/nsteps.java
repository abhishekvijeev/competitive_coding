import java.util.Scanner;

public class nsteps
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t, res;
        boolean found;

        t = sc.nextInt();
        res = 0;
        found = true;

        while(t > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            found = true;

            if(x == y)
            {
                if((x % 2) == 0)
                {
                    res = x * 2;
                }
                else
                {
                    res = (x * 2) - 1;
                }
            }
            else if(x == (y + 2))
            {
                if((x % 2) == 0)
                {
                    res = x + y;
                }
                else
                {
                    res = (x + y) - 1;
                }
            }
            else
            {
                found = false;
            }

            if(found)
            {
                System.out.println(res);
            }
            else
            {
                System.out.println("No Number");
            }
            --t;
        }
    }
}