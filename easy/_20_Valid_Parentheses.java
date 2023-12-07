package easy;

import java.util.Stack;

public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        // VD: s = "()[]{}"
        for (char c : s.toCharArray()) {
            if (c == '(') // Nếu có ( trong chuỗi
                // Thêm cái này vào ngăn xếp
                stack.push(')'); // stack = ")";
            else if (c == '{')
                stack.push('}'); // stack = ")}"
            else if (c == '[')
                stack.push(']'); // stack = ")}]"
            // c = ")" => so sánh stack đầu tiên = ")" có bằng nhau không và dù đúng hay sai
            // cũng xóa ")", nếu không sẽ false
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        char currentChar;
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                stack.push(currentChar);
            }else{
                if(!stack.empty()){
                    if(currentChar == ')'){
                        if(stack.pop() != '('){
                            return false;
                        }
                    }else if(currentChar == '}'){
                        if(stack.pop() != '{'){
                            return false;
                        }
                    }else if(currentChar == ']'){
                        if(stack.pop() != '['){
                            return false;
                        }
                    }else return false;
                }else{
                    return false;
                }
            }

        } return stack.empty();
    }
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "([]}";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));

    }
}
