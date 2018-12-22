import java.util.Scanner;

public class willitst
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.print(((n & (n - 1)) == 0) ? "TAK" : "NIE");
    }
}