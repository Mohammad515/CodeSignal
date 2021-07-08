int arrayChange(int[] inputArray) {
        int d = 0;
        for(int i = 0; i < inputArray.length-1; i++){
            if(inputArray[i] >= inputArray[i+1]){
                d += (inputArray[i] - inputArray[i+1]) + 1;
                inputArray[i+1] += (inputArray[i] - inputArray[i+1]) + 1;
            }
        }
        return d;
    }

