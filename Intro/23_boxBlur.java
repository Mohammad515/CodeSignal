int[][] boxBlur(int[][] image) 
{
 int[][] result = new int[image.length-2][image[0].length-2];
    for (int i =1; i < image.length-1; i++)
        for (int j = 1; j < image[0].length-1; j++) {
            int sum=0;
            for(int ii=i-1;ii<=i+1;ii++) {
                for(int jj=j-1;jj<=j+1;jj++) {
                    sum+=image[ii][jj];
                }               
            }
            result[i-1][j-1]=sum/9;
        }
    return result;
}
