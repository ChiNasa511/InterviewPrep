/* You are asked to help with building a Word Cloud, an infographic where
* the size of the word corresponds to the number of times it is used in 
* a body of text. Write code that takes a large string of text, and builds
* the data needed to make a Word Cloud. You can assume the text will only
* contain words and standard punctuation.
*/

public HashSet<String> createData(String str) {
	// Set to store words
	HashMap<String, Integer> data = new HashMap<String, Integer>();
	String[] words = str.split(" ");
	
	for (String word : words) {
		if (data.containsKey(word)) {
			data.put(word, get.(word) + 1);
		} else {
			data.put(word, 1);
	}
}
