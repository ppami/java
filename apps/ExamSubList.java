package exam;

public class ExamSubList {
	
	public int firstIndex(int[] array, int[] subArray) {
		int decrease = 1;
		int count = 0;

		for (int i = array.length - 1; i >= 0; i--) {
			if (array[i] == subArray[subArray.length - 1]) {
				for (int x = subArray.length - 2; x >= 0; x--) {
					if (subArray[x] == array[i - decrease]) {
						count++;
						decrease++;
					}
				}
				if (count == subArray.length) {
					return i - subArray.length - 1;
					
				} else {
					decrease = 1;
					count = 0;
				}
			}
			
		}
		return 0;

	}
}
