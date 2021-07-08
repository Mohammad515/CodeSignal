String alphabeticShift(String inputString) {
     StringBuilder sb = new StringBuilder();

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if(c == 'z')
                sb.append('a');
            else
                sb.append((char) (inputString.charAt(i) + 1));
        }

        return sb.toString();
    }
