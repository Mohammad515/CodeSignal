/*
 * 
 * Given the string, check if it is a palindrome.
 *
 * Example
 *
 *  For inputString = "aabaa", the output should be checkPalindrome(inputString) = true;
 *  For inputString = "abac", the output should be checkPalindrome(inputString) = false;
 *  For inputString = "a", the output should be checkPalindrome(inputString) = true.
 *
 ******************************************************************************************
 *
 *  Überprüfen Sie, ob der eingegebene String sich um ein Palindrom handelt oder nicht.
 * 
 *  Als Palindrom werden in der Sprachwissenschaft Wörter, Wortreihen oder Sätze bezeichnet, 
 *  die rückwärts gelesen genau denselben Text oder zumindest einen Sinn ergeben.(Wikipedia).
 *
 * z.B
 * 
 * Für inputString = "aabaa" ist die Ausgabe von checkPalindrome(inputString) = true.
 * Für inputString = "abac" ist die Ausgabe von checkPalindrome(inputString) = false.
 * Für inputString = "a" ist die Ausgabe von checkPalindrome(inputString) = true.
 * 
 * @author Mohammad AlMahamed 
 *
 */

boolean checkPalindrome(String inputString) {   
 int i = 0;
 int lastIndex = inputString.length()-1;
 char[] charArray = inputString.toCharArray();
    
 do {
    if(charArray[i]!=charArray[lastIndex-i])
      {return false;}
   i++;
    } 
 while (i <=lastIndex-1);  
  return true;
}
