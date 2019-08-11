import java.util.Scanner;

public class acode
{
    public static int numDecodings(String code)
    {
        int len = code.length();
        int []memo = new int[len + 1];

        memo[0] = 1;
        memo[1] = 1;
        for(int i = 2; i <= len; ++i)
        {
            int digit = code.charAt(i - 1) - '0';
            int prev = code.charAt(i - 2) - '0';

            if(digit != 0)
            {
                memo[i] += memo[i - 1];
            }
            if((prev == 1) || ((prev == 2) && (digit >= 0) && (digit <= 6)))
            {
                memo[i] += memo[i - 2];
            }
        }

        return memo[len];
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        String input;

        input = sc.next();
        while(!(input.compareTo("0") == 0))
        {
            System.out.println(numDecodings(input));
            input = sc.next();
        }
    }
}