/*
 *   CodeSignal/arcade/intro/matrixElementsSum.java 
 *
 *  After becoming famous, the CodeBots decided to move into a new building together. Each of the rooms has a different cost,
 *  and some of them are free, but there's a rumour that all the free rooms are haunted! Since the CodeBots are quite superstitious,
 *  they refuse to stay in any of the free rooms, or any of the rooms below any of the free rooms.
 *
 *  Given matrix, a rectangular matrix of integers, where each value represents the cost of the room,
 *  your task is to return the total sum of all rooms that are suitable for the CodeBots (ie: add up all 
 *  the values that don't appear below a 0).
 *
 * Example
 *
 * For matrix = [[0, 1, 1, 2],[0, 5, 0, 0],[2, 0, 3, 3]] the output should be matrixElementsSum(matrix) = 9
 *
 *  There are several haunted rooms, so we'll disregard them as well as any rooms beneath them. Thus, 
 *  the answer is 1 + 5 + 1 + 2 = 9.
 *
 * @author Mohammad AlMahamed
 *
 */
 
int matrixElementsSum(int[][] matrix) {
  int sum = 0;
  for(int i = 0; i<matrix[0].length;i++){
  for(int j = 0; j<matrix.length;j++){
   if (matrix[j][i] == 0){break;}
   else {sum = sum + matrix[j][i];}
   }
 }
 return sum;
}

