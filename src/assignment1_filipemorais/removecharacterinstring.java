package assignment1_filipemorais;

import java.util.Scanner;

public class removecharacterinstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your word?");
		String word = scanner.nextLine();
		System.out.println("What is the character to be removed?");
		String strToChar = scanner.next();
		char charToRem = strToChar.charAt(0);
	    removeChar(word, charToRem);
	}
	
	static void removeChar(String s, char c)
	{
	    int j, count = 0, n = s.length();
	    char []t = s.toCharArray();
	    for (int i = j = 0; i < n; i++)
	    {
	        if (t[i] != c)
	        t[j++] = t[i];
	        else
	            count++;
	    }
	     
	    while(count > 0)
	    {
	        t[j++] = '\0';
	        count--;
	    }
	     
	    System.out.println(t);
	}

}
