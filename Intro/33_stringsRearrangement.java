boolean stringsRearrangement(String[] inputArray) {
    for (int i = 0; i < inputArray.length; i++) {        
        boolean[] marks = new boolean[inputArray.length];
        marks[i] = true;
        
        if (check(inputArray, marks, i))
            return true;
    }
    return false;
}

boolean check(String[] inputArray, boolean[] marks, int pos) {
    for (int i = 0; i < inputArray.length; i++) {
        int changes = 0;
        if (!marks[i]) {
            for (int j = 0; j < inputArray[i].length(); j++){
                if (inputArray[pos].charAt(j) != inputArray[i].charAt(j))
                    changes++;
            }
            if (changes == 1) {
                marks[i] = true;
                
                boolean end = true;
                for (boolean mark : marks){
                    if (!mark) end = false;
                }
                if (end) return true;
                
                if (check(inputArray, marks, i)) {
                    return true;
                }else{
                    marks[i] = false;
                }
            }
        }
    }
    return false;
}
