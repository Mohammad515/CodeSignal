/*
 * CodeSignal/arcade/intro/sortByHeight.java
 *
 * Some people are standing in a row in a park. There are trees between them which cannot be moved. 
 * Your task is to rearrange the people by their heights in a non-descending order without moving the trees. 
 * People can be very tall!
 *
 * Example
 * 
 * For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 *
 * @author Mohammad AlMahamed
 *
 */
 
 int[] sortByHeight(int[] a) {

   boolean swapped = true;
 
 int j = 0;
 
 int tmp;
 
 while (swapped) {
 
  swapped = false;
 
  j++;
 
  for (int i = 0, k = 0; i < a.length - j; i++)
 
  {
   if (a[i] == -1) {
    k = 0;                    
    continue;
   }
 
   while (i + 1 + k < a.length && a[i + 1 + k] == -1) {
    k++;
   }
 
   if (i + 1 + k < a.length && a[i] > a[i + 1 + k]) {
 
    tmp = a[i];
 
    a[i] = a[i + 1 + k];
 
    a[i + 1 + k] = tmp;
    k = 0;
 
    swapped = true;
   }
  }
 }
 
 return a;
}
