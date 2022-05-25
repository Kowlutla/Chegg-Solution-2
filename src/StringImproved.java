public class StringImproved {

	/**
	 * Field Detail The storage for the characters in the StringImproved class
	 */
	private char[] charArray;

	// Initialize storage string
	public StringImproved(int size) {
		if (size < 1) {
			System.out.println("Size should be a positive number");
		}
		charArray = new char[size];
	}

	public String append(String s) {
		for (int i = 0; i < s.length(); i++) {
			charArray[i] = s.charAt(i);
		}
		return s;
	}

	/*
	 * Method to Get the character at the specified index. The index is an integer
	 * value ranging from 0 to (length - 1), specifying the position of the
	 * character in the character array
	 */
	public char charAt(int location) {
		// if location not in range
		if (location < 0 || location >= charArray.length) {
			return '\0';
		} else// if location in range
		{
			return charArray[location];
		}
	}

	// Checks if the current StringImproved contains the nominated subString
	public int contains(java.lang.String subString) {
		// The outer loop checks against each character in your character array
		for (int i = 0; i < charArray.length - subString.length(); i++) {
			// When you detect the first matching letter in the search subString
			if (charArray[i] == subString.charAt(0)) {
				int temp = 0;// to hold the index of subString
				boolean isSub = true;// initially make isSub true(Assuming subString present in charArray)
				// inner loop to check if the rest of the characters match.
				for (int j = i; j < i + subString.length(); j++) {
					// if any character not matach mark isSub as false and break
					if (charArray[j] != subString.charAt(temp++)) {
						isSub = false;
						break;
					}
				}
				// if subString matched return the starting position
				if (isSub) {
					return i;
				}
			}
		}
		// if no substring found return -1;
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringImproved stringImproved = new StringImproved(20);
		System.out.println(stringImproved.append("Helloworworld"));
		System.out.println(stringImproved.charAt(5));
		System.out.println(stringImproved.contains("wor"));
	}
}
