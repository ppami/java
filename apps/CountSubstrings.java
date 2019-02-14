package countsubstrings;

public class CountSubstrings {
	public int countSubstrings(String s) {
		int numberOfSubstrings = 0;
		char[] sCharArray = s.toCharArray();
		
		for (int i = 0; i < sCharArray.length; i++) {
			if (sCharArray[i] == '1') {
				for (int x = i+1; x < sCharArray.length - i; x++ ){
					if (sCharArray[x] == '1') {
						numberOfSubstrings++;
					}
				}
			}
			if (i == sCharArray.length - 1 && sCharArray[sCharArray.length - 1] == '1') {
				numberOfSubstrings++;
			}
		}
		
		return numberOfSubstrings;
	}
}
