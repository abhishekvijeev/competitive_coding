import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class absys
{
    public static void main(String []args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = 0;
        String input = "";
        String []parts;
        int op1 = 0, op2 = 0, sum = 0;

        t = Integer.parseInt(br.readLine());
        while(t > 0)
        {
            br.readLine();
            input = br.readLine();
            parts = input.split(" ");
            if(parts[0].contains("m"))
            {
                op2 = Integer.parseInt(parts[2]);
                sum = Integer.parseInt(parts[4]);
                op1 = sum - op2;
            }
            else if(parts[2].contains("m"))
            {
                op1 = Integer.parseInt(parts[0]);
                sum = Integer.parseInt(parts[4]);
                op2 = sum - op1;
            }
            else
            {
                op1 = Integer.parseInt(parts[0]);
                op2 = Integer.parseInt(parts[2]);
                sum = op1 + op2;
            }
            System.out.println(op1 + " + " + op2 + " = " + sum);
            t--;
        }
    }
}