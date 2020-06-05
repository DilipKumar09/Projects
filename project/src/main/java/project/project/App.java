package project.project;

public class App {

	public Response findLongestWord(String str) {
		int wordlen = 1;
		int wordIndex = 0;
		if (str == null || str.isEmpty()) {
			return null;
		}
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > wordlen) {
				wordlen = words[i].length();
				wordIndex = i;
			}
		}

		return new Response(words[wordIndex], wordlen);
	}

	public Response findSmallestWord(String str) {
		
		int wordlen = 1;
		int wordIndex = 0;
		
		if (str == null || str.isEmpty()) {return null;}
		
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() <= wordlen) {
				wordlen = words[i].length();
				wordIndex = i;
			}
		}
		return new Response(words[wordIndex], wordlen);
		
	}

	class Response {
		String word;
		int wordLen;
		protected Response(String word, int wordLen) {
			this.word = word;
			this.wordLen = wordLen;
		}
	}
}