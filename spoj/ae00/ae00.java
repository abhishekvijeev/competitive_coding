import java.util.Scanner;


public class ae00
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count, sq_root;

        count = 0;
        sq_root = (int)Math.sqrt(n);

        /* Brute Force Solution
         *
         * for(int i = 1; i <= n; ++i)
         * {
         *      count ++;
         *      for(int j = 2; j <= Math.sqrt(i); ++j)
         *      {
         *          if((i % j) == 0)
         *          {
         *              ++count;
         *          }
         *      }
         * }
         */

         /* Optimal O(sqrt(n)) Solution
          * 
          * If lxb represents a rectangle with length 'l' and breadth 'b', 
          * the rectangles that can be made using exactly 'n' squares
          * for (1 <= n <= 10) are as follows:
          * 
          * n = 1  => 1x1 
          * n = 2  => 1x2
          * n = 3  => 1x3
          * n = 4  => 1x4    2x2
          * n = 5  => 1x5
          * n = 6  => 1x6    2x3
          * n = 7  => 1x7
          * n = 8  => 1x8    2x4
          * n = 9  => 1x9            3x3
          * n = 10 => 1x10   2x5
          *           
          * As factors of a number occur in pairs, with one number less than
          * sqrt(n) and the other number greater than sqrt(n), we only need to consider
          * values of length from 1 to sqrt(n) inclusive, since considering values of
          * length greater than sqrt(n) would lead to counting the same pair (and hence
          * the same rectangle) twice. (For example if n = 10, floor(sqrt(10)) = 3. Since 
          * 2x5 and 5x2 are the same, we need to consider factors only upto 3). Hence, we
          * count all rectangles with length 'l', where l <= sqrt(n)

          * We see that there are 
          *     'n'   1xb rectangles,
          *     'n/2' 2xb rectangles,
          *     'n/3' 3xb rectangles... and so on
          *           
          * However using this logic, we notice that some of these rectangles 
          * are counted twice (for example, the 1x2 and 2x1 rectangles are the same)   
          * But, observe that for a given value of 'l', the rectangles with breadth 'b',
          * such that (b < l), have already been counted (for example, if l = 2, we would
          * have counted the rectangle 2x1, since it is the same as 1x2). Hence, given
          * length 'l', the number of rectangles already counted are (l - 1)
          * 
          * To conclude, the number of unique rectangles that can be made with length
          * 'l', given 'n' squares is (n / l) + (l - 1), and we iterate through all
          * values of 'l', for 1 <= l <= sqrt(n)
          */
        for(int l = 1; l <= sq_root; ++l)
        {
            count += (n / l) - (l - 1);
        }
        
        System.out.print(count);
    }
}