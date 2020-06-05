package project.project;

import junit.framework.TestCase;

import project.project.*;
import project.project.App.Response;

public class AppTest extends TestCase {

	private int wordlen;
	private String logestword;
	private String smallestWord;
	Response resLongestWord;
	Response resSmallestWord;
	App obj = new App();
	
	protected void setUp() throws Exception {
			super.setUp();
			wordlen = 11;
			logestword = "longestWord";
			smallestWord = "I";
			resLongestWord = obj.findLongestWord("I am testing longestWord in given string");
			resSmallestWord = obj.findSmallestWord("I am testing smallestWord in given string");
		}
	
	
	public void testLogestWord() {
		System.out.print("logestword : "+resLongestWord.word);
		assertEquals(logestword, resLongestWord.word);
    }	
	public void testReqResNotSame() {
		assertNotSame("", resLongestWord.word);
    }
	public void testStringNotNull() {
		assertNotNull(resLongestWord.word);
    }
	public void testEmptyString() {
		assertNull(obj.findLongestWord(""));
    }
	public void testNullString() {
		assertNull(obj.findLongestWord(null));
    }
	public void testWordLen() {
		assertEquals(11,resLongestWord.wordLen);
    }
	
	/*
	 *  Test cases for smallest word in give string 
	 */	
	public void testSmallestWord() {
		System.out.print("smallestWord : "+resSmallestWord.word);
		assertEquals(smallestWord, resSmallestWord.word);
    }	
	public void testReqResNotSameforSmallestword() {
		assertNotSame("", resSmallestWord.word);
    }
	public void testStringNotNullSmallestWord() {
		assertNotNull(resSmallestWord.word);
    }
	public void testEmptyStringSmallestWord() {
		assertNull(obj.findSmallestWord(""));
    }
	public void testNullStringSmallestWord() {
		assertNull(obj.findSmallestWord(null));
    }
	public void testWordLenSmallestWord() {
		assertEquals(1,resSmallestWord.wordLen);
    }
	
}
