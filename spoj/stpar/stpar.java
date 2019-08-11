import java.util.Scanner;
import java.util.Stack;

public class stpar
{
    static Scanner sc = new Scanner(System.in);

    public static boolean canSort(int num_trucks)
    {
        int input = 0, searching_for = 1;
        Stack<Integer> side_street = new Stack<>();

        for(int i = 0; i < num_trucks; i++)
        {
            input = sc.nextInt();
            if(input == searching_for)
            {
                ++searching_for;
                while(!side_street.empty() && (side_street.peek() == searching_for))
                {
                    side_street.pop();
                    ++searching_for;
                }
            }
            else
            {
                side_street.push(input);
            }
        }

        if(side_street.empty())
        {
            return true;
        }

        return false;
    }

    public static void main(String []args)
    {
        int num_trucks = 0;

        while((num_trucks = sc.nextInt()) > 0)
        {
            if(canSort(num_trucks))
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}