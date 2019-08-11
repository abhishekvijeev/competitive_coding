import java.util.Scanner;

public class addrev
{
    public static int reverse(int n)
    {
        int rev, rem;

        rev = rem = 0;

        while(n != 0)
        {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }

        return rev;
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t, n1, n2, rev_n1, rev_n2, rev_sum, sum;

        t = sc.nextInt();
        n1 = n2 = 0;
        rev_n1 = rev_n2 = 0;
        rev_sum = sum = 0;

        while(t > 0)
        {
            n1 = sc.nextInt();
            n2 = sc.nextInt();

            rev_n1 = reverse(n1);
            rev_n2 = reverse(n2);
            rev_sum = rev_n1 + rev_n2;
            sum = reverse(rev_sum);
            System.out.println(sum);
            --t;
        }
    }
}