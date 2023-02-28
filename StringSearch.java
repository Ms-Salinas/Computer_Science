//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import static java.lang.System.*;

public class StringSearch
{
	/*
	 *method countWords will count the occurrences of word in sent
	 *there may many occuurences of word or none at all
	 */
	public static int countWords(String sent, String word)
	{
		int count = 0;
		int loc = 0;
		while(sent.indexOf(word, loc)>-1)
		{
			loc = sent.indexOf(word, loc)+1;
			count++;
		}
		return count;
	}

	/*
	 *method countLetters will count the occurrences of letter in sent
	 *there may many occuurences of letter or none at all
	 */
	public static int countLetters(String sent, String letter)
	{
		return countWords( sent, letter );
	}
}