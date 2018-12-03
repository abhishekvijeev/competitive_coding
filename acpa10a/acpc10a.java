import java.util.Scanner;

public class acpc10a
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        while(!((a == 0) && (b == 0) && (c == 0)))
        {
            if((2 * b) == (a + c))
            {
                int comm_diff = b - a;
                System.out.println("AP " + (c + comm_diff));
            }
            else if((b * b) == (a * c))
            {
                int comm_ratio = b / a;
                System.out.println("GP " + (c * comm_ratio));
            }
            
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
    }
}