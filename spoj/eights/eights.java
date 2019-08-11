import java.util.Scanner;

public class eights
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t;

        t = sc.nextInt();
        while(t > 0)
        {
            long k = sc.nextLong();
            System.out.println(192 + (k - 1) * 250);
            --t;
        }
    }
}