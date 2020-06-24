/*  
 *  CodeSignal/arcade/intro/reverseInParentheses.java
 *
 * Write a function that reverses characters in (possibly nested) parentheses in the input string.
 *
 * Input strings will always be well-formed with matching ()s.
 *
 * Example
 * For inputString = "(bar)", the output should be reverseInParentheses(inputString) = "rab";
 * For inputString = "foo(bar)baz", the output should be reverseInParentheses(inputString) = "foorabbaz";
 * For inputString = "foo(bar)baz(blim)", the output should be reverseInParentheses(inputString) = "foorabbazmilb";
 *
 * @author Mohammad AlMahamed 
 *
 */
 
 String reverseInParentheses(String inputString) {
        while (inputString.contains("(")) {
        StringBuilder sb = new StringBuilder();
        for (int i = inputString.lastIndexOf("(") + 1; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ')') {
                break;
            } else {
                sb.append(inputString.charAt(i));
            }
        }
            inputString = inputString.replace("(" + sb.toString() + ")", sb.reverse());
    }
    return inputString;
}
