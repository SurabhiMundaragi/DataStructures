import java.util.Arrays;

public class FindIfUnique {

	public static void main(String[] args) {
		
		FindIfUnique ele = new FindIfUnique();
		String str1 = "Adirtygd";
//		System.out.println(ele.findIfUnique(str));
//		
//		String str1 = "hello";
//		System.out.print("reversed string: " + strRev(str1));
//		
		System.out.println(strRevRec(str1));
		StringBuilder str = new StringBuilder();
		str.reverse();
		
		System.out.print(isPermutation());
	}
	
	public boolean findIfUnique(String str){
		
		if(str.length()>256){
			return false;
		}
		
		boolean[] check = new boolean[256];
		for (int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(check[val]){
				return false;
			}
			check[val] = true;
		}
		return true;
	}
	
	//Reverse String
	public static String strRev(String str1){
		
		StringBuffer str2 = new StringBuffer();
		for(int i=str1.length()-1;i>=0;i--){
			str2.append(str1.charAt(i));
		}
		return str2.toString();
	}
	
	//Recursive reverse of string
	public static String strRevRec(String str1){
		
		if(str1.length()<=1 || null==str1){
			return str1;
		}
		return strRevRec(str1.substring(1)) + str1.charAt(0);
	}
	
	//check whether 2 string are permutation to each other
	public static boolean isPermutation(){
		String str1 = "aditya";
		String str2 = "ditya";
		
		int[] array = new int[256];
		for(int i=0;i<str1.length();i++){
			char c = str1.charAt(i);
			array[c]++;
		}
		
		for(int j=0;j<str2.length();j++){
			char c = str2.charAt(j);
			if(--array[c]<0){
				return false;
			}
		}
		return true;
	}
}
