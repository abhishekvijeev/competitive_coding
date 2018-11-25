import java.util.Scanner;

public class candy
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n, total;

        n = sc.nextInt();
        total = 0;

        while(n != -1)
        {
            int []packets = new int[n];
            total = 0;
            for(int i = 0; i < n; ++i)
            {
                packets[i] = sc.nextInt();
                total += packets[i];
            }
            
            if((total % n) != 0)
            {
                System.out.println("-1");
            }
            else
            {
                int candies = total / n;
                int steps = 0;
                for(int i = 0; i < n; ++i)
                {
                    steps += Math.abs(packets[i] - candies);
                }
                System.out.println(steps / 2);
            }
            n = sc.nextInt();
        }
    }
}