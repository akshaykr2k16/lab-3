import java.util.Stack;

public class Balanced {
    public static void main (String [] args)
    {
    	 String test_balanced = "()(){}{}{()}";
         String test_unbalanced= "((({}{}))()";

         System.out.println(checkBalanced(test_balanced ));
         System.out.println(checkBalanced(test_unbalanced));
    }

    public static boolean checkBalanced(String check)
    {
        Stack<Character> S = new Stack<Character>();
        for(int a = 0; a < check.length(); a++)
        {
            char ch = check.charAt(a);
            if(ch== '[' || ch == '{' || ch == '(')
                S.push(ch);
            else if(ch== ']' || ch== '}' || ch == ')')
            {
                if(S.empty())
                    return false;
                switch(ch)
                {
                     case ']':
                        if (S.pop() != '[')
                            return false;
                        break;
                    case '}':
                        if (S.pop() != '{')
                            return false;
                        break;
                    case ')':
                        if (S.pop() != '(')
                            return false;
                        break;
                    default:
                        break;
                }
            }
        }
        if(S.empty())
            return true;
        return false;
    }
}