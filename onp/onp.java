import java.util.*;

public class onp
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int t;
		String expression;
		
		t = sc.nextInt();
		while(t > 0)
		{
			expression = sc.next();
			int len = expression.length();
			
			Stack<Character> brackets = new Stack<>();
			Stack<String> comp_elems = new Stack<>();
			
			for(int i = 0; i < len; ++i)
			{
				char c = expression.charAt(i);
				if(Character.isLetter(c) || c == '+' || c == '-' || c == '*' || c == '/' || c == '^')
				{
					comp_elems.push(Character.toString(c));
				}
				else if(c == '(')
				{
					brackets.push(c);
				}
				else if(c == ')')
				{
					String op2 = comp_elems.pop();
					String operand = comp_elems.pop();
					String op1 = comp_elems.pop();
					comp_elems.push(op1 + op2 + operand);
					brackets.pop();
				}
			}
			
			System.out.println(comp_elems.pop());
			--t;
		}
		sc.close();
	}
}
