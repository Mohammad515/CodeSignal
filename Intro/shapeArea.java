/*
 * CodeSignal/arcade/intro/shapeArea.java 
 *
 * Example
 * 
 * For n = 2, the output should be shapeArea(n) = 5;
 * For n = 3, the output should be shapeArea(n) = 13
 *
 ***************************************************************************
 *
 * z.B 
 *
 * Für n = 2 sollte die Ausgabe von shapeArea(n) = 5 sein.
 * Für n = 3 sollte die Ausgabe von shapeArea(n) = 13 sein.
 * 
 *
 * @author Mohammad AlMahamed
 *
 */
 
int shapeArea(int n) {
    int numMiddleBoxes = 1 + (2 * (n-1));
    int leftsideArea = 0;
    
    int boxesToAdd = numMiddleBoxes-2;
    
    while(boxesToAdd >= 1) {
        leftsideArea += boxesToAdd;
        boxesToAdd -= 2;
    }
    
    int area = (leftsideArea*2) + numMiddleBoxes;
    
    return area;
}
