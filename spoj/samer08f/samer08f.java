import java.util.Scanner;

public class samer08f
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n != 0)
        {
            int res = (n * (n + 1) * ((2 * n) + 1)) / 6;
            System.out.println(res);
            n = sc.nextInt();
        }
    }
}