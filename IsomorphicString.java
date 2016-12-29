import java.util.*;
public class IsomorphicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String s1 = s.next();
		String s2 = s.next();
		char c1,c2;
		int flag= 1;
		HashMap<Character, Character> map = new HashMap<Character,Character>();
		if(s1.length() == s2.length())
		{
			for(int i = 0; i< s1.length();i++)
			{
				c1 = s1.charAt(i);
				c2 = s2.charAt(i);
				if(map.containsKey(c1))
				{
					if(map.get(c1)!=c2)
						flag = 0;
				}
				else
				{
					if(map.containsValue(c2))
					{
						flag = 0;
					}
				}
			}
			if(flag == 1)
				System.out.println(" Isomorphic ");
			else
				System.out.println(" Not Isomorphic ");
			
		}
		else 
			System.out.println("Not Isomorphic");
		return;
	}

}
