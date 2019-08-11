import java.util.Scanner;
import java.util.Arrays;

public class aggrcow
{
    public static int getLargestDist(int []stalls, int cows)
    {
        int len = stalls.length;
        int low = 0, high = 0, target = 0, p1 = 0, p2 = 0, assigned_cows = 0;
        if(len == 2 && cows == 2)
        {
            return Math.abs(stalls[1] - stalls[0]);
        }
            
        Arrays.sort(stalls);
        low = stalls[1] - stalls[0];
        high = stalls[len - 1] - stalls[0];

        while(low < high)
        {
            target = low + (high - low + 1) / 2;
            p1 = stalls[0];
            assigned_cows = 1;
            for(int i = 1; i < len; i++)
            {
                p2 = stalls[i];
                if((p2 - p1) >= target)
                {
                    assigned_cows++;
                    p1 = stalls[i];
                }
            }

            if(assigned_cows >= cows)
            {
                low = target;
            }
            else
            {
                high = target - 1;
            }
        }
        return low;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t = 0, n = 0, c = 0;
        int []stalls;

        t = sc.nextInt();
        while(t > 0)
        {
            n = sc.nextInt();
            c = sc.nextInt();
            stalls = new int[n];
            for(int i = 0; i < n; i++)
            {
                stalls[i] = sc.nextInt();
            }
            System.out.println(getLargestDist(stalls, c));
            t--;
        }
        sc.close();
    }
}