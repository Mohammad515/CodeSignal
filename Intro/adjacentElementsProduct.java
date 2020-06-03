/*
 * 
 *  Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
 *  
 * Example
 *
 * For inputArray = [3, 6, -2, -5, 7, 3], the output should be adjacentElementsProduct(inputArray) = 21 
 * (7 and 3 produce the largest product )
 *
 *  @author Mohammad AlMahamed 
 *
 */
 
 int adjacentElementsProduct(int[] inputArray) {
    
  int max = Integer.MIN_VALUE;
    
  for(int i=0;i<inputArray.length-1;i++)
   {
    if(inputArray[i]*inputArray[i+1]>max)
    {
    max = inputArray[i]*inputArray[i+1];
    }
  }
 return max;
