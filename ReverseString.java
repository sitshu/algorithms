/*Given an input string, reverse the string word by word.
 *  A word is defined as a sequence of non-space characters.
 */
import java.util.*;

public class ReverseString {
//   public String string;
   
   public void reverse(String[] string)
   {
	   int i = 0;
	   int j = string.length - 1;
	   String temp;
	   while(i<j)
	   {
		   temp = string[i];
		   string[i]=string[j];
		   string[j]=temp;
		   i++;
		   j--;
		  // System.out.println("i :"+ i)
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		ReverseString r = new ReverseString();
		
		String[] words = input.split(" ");
		
		r.reverse(words);
		for(int i = 0; i < words.length; i++)
		{
			System.out.println("word : "+ words[i]);
		}
				
		return;
	}

}
