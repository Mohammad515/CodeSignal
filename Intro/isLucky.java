/*
 * CodeSignal/arcade/intro/isLucky.java
 *
 *  Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky
 *  if the sum of the first half of the digits is equal to the sum of the second half.
 *
 *  Example
 *
 * For n = 1230, the output should be isLucky(n) = true;
 * For n = 239017, the output should be isLucky(n) = false.
 *
 * @author Mohammad AlMahamed 
 */
 
boolean isLucky(int n) {
  int temp = n;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    do{
        arr.add(temp % 10);
        temp /= 10;
    } while  (temp > 0);
    Collections.reverse(arr);
    int sum1 = 0, sum2 = 0;
    for(int i = 0, j = arr.size() - 1; i < arr.size() / 2; i++, j--){
        sum1 += arr.get(i);
        sum2 += arr.get(j);
    }
    if(sum1 == sum2){
        return true;
    }else{
        return false;
    }
}
