/* You are asked to help with building a Word Cloud, an infographic where
* the size of the word corresponds to the number of times it is used in 
* a body of text. Write code that takes a large string of text, and builds
* the data needed to make a Word Cloud. You can assume the text will only
* contain words and standard punctuation.


	Public HashSet<String> createData(String str) {
// Set to store words
	HashSet<String> data = new HashSet<String>();


	// Counter
	Int counter = 0;
	For (String word : str.split(“ ”)) {
		If (data.contains(word)) {
counter++; 
		} else {
		data.add(word);
Counter++;
}
}
