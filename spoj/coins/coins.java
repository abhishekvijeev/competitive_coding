import java.io.*;

public class coins
{
    static int[] memo;

    public static long maxDollars(int n)
    {
        if(n < 10000)
            return memo[n];
        return maxDollars(n / 2) + maxDollars(n / 3) + maxDollars(n / 4);
    }

    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        memo = new int[10000];
        String st = "";
        int n = 0;
        
        for(int i = 0; i < 10000; ++i)
        {
            if(i < 12)
                memo[i] = i;
            else
                memo[i] = memo[i / 2] + memo[i / 3] + memo[i / 4];
        }
        while((st = br.readLine()) != null)
        {
            n = Integer.parseInt(st);
            System.out.println(maxDollars(n));
        }
    }
}