import java.util.Scanner;

public class permut2
{
    public static int[] getInvPerm(int []ar)
    {
        int len = ar.length;
        int []inv = new int[len + 1];

        for(int i = 0; i < len; i++)
        {
            inv[ar[i]] = i + 1;
        }
        return inv;
    }
    public static boolean checkAmbiguous(int []ar)
    {
        int len = ar.length;
        int []inv = getInvPerm(ar);
        System.out.println("inv: " + Arrays.toString(inv));
        for(int i = 0; i < len; i++)
        {
            if(ar[i] != inv[i + 1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int []ar;
        boolean ambiguous = false;
        
        n = sc.nextInt();
        while(n != 0)
        {
            ar = new int[n];
            for(int i = 0; i < n; i++)
            {
                ar[i] = sc.nextInt();
            }
            ambiguous = checkAmbiguous(ar);
            if(ambiguous)
            {
                System.out.println("ambiguous");
            }    
            else
            {
                System.out.println("not ambiguous");
            }
            n = sc.nextInt();
        }
    }
}