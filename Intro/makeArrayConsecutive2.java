/*
 *  Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative 
 *  integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each
 *  statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. 
 *  Help him figure out the minimum number of additional statues needed.
 *
 * Example
 *
 * For statues = [6, 2, 3, 8], the output should be makeArrayConsecutive2(statues) = 3.
 * Ratiorg needs statues of sizes 4, 5 and 7.
 *
 **************************************************************************************************************************
 * 
 *
 * z.B
 *
 * Für statues = [6, 2, 3, 8] sollte die Ausgabe von makeArrayConsecutive2(statues) = 3 sein.
 *
 *
 * @author Mohammad AlMahamed
 *
 */
 
int makeArrayConsecutive2(int[] statues) {

  Arrays.sort(statues);
    int n = statues.length;
    int max = statues[n-1];
    int min = statues[0];
    return max - min - n + 1;
}
