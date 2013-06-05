package ArraysandStrings;

public class Anagram {

	public static boolean anagram(String s,String t){
		if(s.length()!=t.length())
			return false;
		int[] letters= new int[256];
		for(int i=0;i<s.length();i++){
			int c = (int)s.charAt(i);
			letters[c]++;
		}
		
		for(int i=0;i<t.length();i++){
			int c = t.charAt(i);
			if (letters[c] == 0) {
				return false;
			} else {
				letters[c]--;
			}
			// or --letters[c] < 0 return false
		
		}
		return true;
		
	}
	
	public static void main(String args[]){
		String s="smile";
		String t="milve";
		System.out.print(anagram(s,t));
	}
}
