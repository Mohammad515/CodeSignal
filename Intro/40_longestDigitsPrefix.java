String longestDigitsPrefix(String inputString) {
    	String myRegex = "^\\d+";
		Pattern pattern = Pattern.compile(myRegex);
		Matcher matcher = pattern.matcher(inputString);
		if(matcher.find()){
			return matcher.group(0);
		}
		return "";
	}
