import java.util.Scanner;
import java.util.ArrayList;

public class fctrl2
{
    public static void fact(int n)
    {
        ArrayList<Integer> factorial = new ArrayList<>(1000);
        int fact_len = 1;

        factorial.add(1);
        for(int i = 2; i <= n; ++i)
        {
            fact_len = multiply(i, factorial, fact_len);
        }

        for(int i = fact_len - 1; i >= 0; --i)
        {
            System.out.print(factorial.get(i));
        }
        System.out.println();
    }

    public static int multiply(int x, ArrayList<Integer> factorial, int fact_len)
    {
        int carry = 0;

        for(int i = 0; i < fact_len; ++i)
        {
            int digit = factorial.get(i);
            int product = (digit * x) + carry;
            factorial.set(i, product % 10);
            carry = product / 10;    
        }

        while(carry != 0)
        {
            factorial.add(carry % 10);
            ++fact_len;
            carry = carry / 10;
        }

        return fact_len;
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t, n;

        t = sc.nextInt();
        n = 0;

        while(t > 0)
        {
            n = sc.nextInt();
            fact(n);
            --t;
        }
    }    
}