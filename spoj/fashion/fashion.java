import java.util.Scanner;
import java.util.Arrays;

public class fashion
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t, n, sum;
        int []men;
        int []women;

        t = sc.nextInt();
        n = sum = 0;

        while(t > 0)
        {
            n = sc.nextInt();
            sum = 0;
            men = new int[n];
            women = new int[n];

            for(int i = 0; i < n; ++i)
            {
                men[i] = sc.nextInt();
            }
            for(int i = 0; i < n; ++i)
            {
                women[i] = sc.nextInt();
            }
            Arrays.sort(men);
            Arrays.sort(women);

            for(int i = 0; i < n; ++i)
            {
                sum += (men[i] * women[i]);
            }
            System.out.println(sum);
            --t;
        }
    }
}