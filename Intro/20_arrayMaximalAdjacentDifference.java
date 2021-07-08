int arrayMaximalAdjacentDifference(int[] inputArray) {
        int answer = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (Math.abs(inputArray[i] - inputArray[i - 1]) > answer) {
                answer = Math.abs(inputArray[i] - inputArray[i - 1]);
            }
        }
        return answer;
    
