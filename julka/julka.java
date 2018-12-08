import java.util.*;

public class julka
{
    public static String removeLeadingZeroes(StringBuilder s)
    {
        int index, len;
        String res;

        res = "";
        len = s.length();
        index = 0;
        if(len > 1)
        {
            while((index < len) && s.charAt(index) == '0')
            {
                index++;
            }
            if(index == len)
            {
                res = "0";
            }
            else
            {
                res = s.substring(index);
            }
        }
        else
        {
            res = s.toString();
        }        
        return res;
    }
    public static String divide_by_2(String s)
    {
        int len, q, r, num, digit;
        StringBuilder result;

        len = s.length();
        result = new StringBuilder(len);
        q = r = num = digit = 0;
        for(int i = 0; i < len; ++i)
        {
            digit = (int)(s.charAt(i) - '0');
            num = (10 * r) + digit;
            q = num / 2;
            r = num % 2;
            result.append(q);
        }
        return removeLeadingZeroes(result);
    }
    public static String add(String a, String b)
    {
        int len1, len2, iTemp, carry, d1, d2, sum;
        String sTemp;
        StringBuilder result;

        len1 = a.length();
        len2 = b.length();
        iTemp = carry = d1 = d2 = sum = 0;
        sTemp = "";
        
        if(len2 > len1)
        {
            sTemp = a;
            a = b;
            b = sTemp;

            iTemp = len1;
            len1 = len2;
            len2 = iTemp;
        }
        result = new StringBuilder(len1 + 1);
        //System.out.println(a + " " + b);
        //At this point, the longer number is in String 'a'
        for(int i = (len1 - 1), j = (len2 - 1); j >= 0; --i, --j)
        {
            d1 = (int)(a.charAt(i) - '0');
            d2 = (int)(b.charAt(j) - '0');
            sum = d1 + d2 + carry;
            
            result.append(sum % 10);
            carry = sum / 10;
            //System.out.println("d1 = " + d1 + " d2 = " + d2 + " carry = " + carry + " sum = " + sum);
        }
        for(int i = (len1 - len2 - 1); i >= 0; --i)
        {
            d1 = (int)(a.charAt(i) - '0');
            sum = d1 + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }
        result.append(carry);
        //System.out.println(result.toString());
        return removeLeadingZeroes(result.reverse());

    }
    public static String subtract(String a, String b)
    {
        int len1, len2, iTemp, carry, d1, d2, diff;
        String sTemp;
        StringBuilder result;

        len1 = a.length();
        len2 = b.length();
        iTemp = carry = d1 = d2 = diff = 0;
        sTemp = "";
        
        if(len2 > len1)
        {
            sTemp = a;
            a = b;
            b = sTemp;

            iTemp = len1;
            len1 = len2;
            len2 = iTemp;
        }
        result = new StringBuilder(len1);

        for(int i = len1 - 1, j = len2 - 1; j >= 0; --i, --j)
        {
            d1 = (int)(a.charAt(i) - '0');
            d2 = (int)(b.charAt(j) - '0');
            diff = d1 - d2 - carry;
            //System.out.println("diff_1 = "+ diff);
            if(diff < 0)
            {
                diff += 10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }
            //System.out.println("diff_2 = " + diff + " carry = " + carry);
            result.append(diff);
        }
        for(int i = len1 - len2 - 1; i >= 0; --i)
        {
            d1 = (int)(a.charAt(i) - '0');
            diff = d1 - carry;
            //System.out.println("diff_1 = "+ diff);
            if(diff < 0)
            {
                diff += 10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }
            //System.out.println("diff_2 = " + diff + " carry = " + carry);
            result.append(diff);
        }
        //System.out.println(result);
        return removeLeadingZeroes(result.reverse());
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t;
        String a, b;
        String k, n;

        t = 10;
        a = b = k = n = "";
        while(t > 0)
        {
            a = sc.next();
            b = sc.next();
            k = divide_by_2(add(a, b));
            n = subtract(k, b);
            System.out.println(k);
            System.out.println(n);
            --t;
        }
    }
}