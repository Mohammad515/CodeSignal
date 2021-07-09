int digitDegree(int n) {
    String s = String.valueOf(n);
		int count = 0;

		int i = 0;
		int tempNumber = 0;
		while(s.length() > 1 && i < s.length()) {
			int currentDigit = s.charAt(i) - '0';
			tempNumber += currentDigit;
			if(i == s.length()-1) {
				count++;
				i = 0;
				s = String.valueOf(tempNumber);
				tempNumber = 0;
				continue;
			}
			i++;

		}
		
		return count;
	}
