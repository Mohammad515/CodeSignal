/*
 *   CodeSignal/arcade/intro/commonCharacterCount.java
 *
 * Given two strings, find the number of common characters between them.
 *
 * Example
 *
 * For s1 = "aabcc" and s2 = "adcaa", the output should be commonCharacterCount(s1, s2) = 3.
 * Strings have 3 common characters - 2 "a"s and 1 "c".
 *
 *
 *
 * @author Mohammad AlMahamed
 *
 */


int commonCharacterCount(String s1, String s2) {
    int c = 0;
    ArrayList<Integer> arr = new ArrayList<>();
    for(int i = 0; i < s1.length(); i++) {
        for (int j = 0; j < s2.length(); j++) {
            if (!arr.contains(j) && s1.charAt(i) == s2.charAt(j)) {
                c++;
                arr.add(j);
                break;
            }
        }
    }
    
    return c;
}
