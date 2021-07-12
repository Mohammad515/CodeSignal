boolean isBeautifulString(String inputString) {
     int[] occurs = new int[26];

        for(char c : inputString.toCharArray()){
            occurs[c - 'a']++;
        }

        for(int i = 0; i < occurs.length - 1; i++){
            if(occurs[i + 1] > occurs[i])
                return false;
        }

        return true;
    }
