import java.util.*;

public class toandfro
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int columns, rows, len;

        columns = sc.nextInt();
        rows = 0;
        len = 0;

        while(columns != 0)
        {
            String st = sc.next();
            len = st.length();
            rows = len / columns;
            for(int i = 0; i < columns; ++i)
            {
                for(int j = 0; j < rows; ++j)
                {
                    if((j % 2) == 0)
                    {
                        System.out.print(st.charAt((j * columns) + i));
                    }
                    else
                    {
                        System.out.print(st.charAt((j * columns) + columns - i - 1));
                    }
                }
            }
            System.out.println();
            columns = sc.nextInt();
        }
    }
}