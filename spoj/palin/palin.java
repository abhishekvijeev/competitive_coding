import java.util.*;

public class palin
{
    public static void printNextPalindrome(StringBuilder num, int len)
    {
        int mid, i, j;
        boolean incrementMid;

        mid = len / 2;
        i = mid - 1;
        j = ((len % 2) == 0) ? mid : (mid + 1);
        incrementMid = false;

        while((i >= 0) && (num.charAt(i) == num.charAt(j)))
        {
            --i;
            ++j;
        }
        //System.out.println("i = " + i + ", j = " + j);

        if((i < 0) || (num.charAt(i) < num.charAt(j)))
        {
            incrementMid = true;
        }

        while(i >= 0)
        {
            char iDigit = num.charAt(i);
            num.setCharAt(j, iDigit);
            --i;
            ++j;
        }

        if(incrementMid)
        {
            int iDigit;
            boolean overflow;
            
            i = ((len % 2) == 0) ? (mid - 1) : mid;
            j = mid;
            //System.out.println("i = " + i + ", j = " + j);
            overflow = false;

            do
            {
                iDigit = (int)(num.charAt(i) - '0');
                //System.out.println("iDigit = " + iDigit);
                ++iDigit;
                num.setCharAt(i, (char)((iDigit % 10) + '0'));
                num.setCharAt(j, (char)((iDigit % 10) + '0'));
                overflow = ((iDigit / 10) > 0) ? true : false;
                //System.out.println(iDigit + "/" + "10 = " + iDigit / 10);
                --i;
                ++j;
            }
            while(overflow && (i >= 0));     
        }

        System.out.println(num.toString());
    }

    public static boolean hasAllNines(StringBuilder num, int len)
    {
        boolean result = true;
        for(int i = 0; i < len; ++i)
        {
            if(num.charAt(i) != '9')
            {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t;
        
        t = sc.nextInt();
        while(t > 0)
        {
            StringBuilder num = new StringBuilder(sc.next());
            int len = num.length();
            if(hasAllNines(num, len))
            {
                System.out.print("1");
                for(int i = 0; i <= (len - 2); i++)
                {
                    System.out.print("0");
                }
                System.out.println("1");
            }
            else
            {
                printNextPalindrome(num, len);
            }
            --t;
        }
    }
}