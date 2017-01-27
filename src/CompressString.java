
public class CompressString {

	public static void main(String[] args) {
		CompressString spc = new CompressString();
		
		String str1 = "aabbccccdd";
		System.out.println(CompressString.compressString(str1));
	}	
	
	public static String compressString(String str){
		
		StringBuilder strb = new StringBuilder();
		int count=0;
		for(int i=0;i<str.length()-1;i++){
			
			if(str.charAt(i)==str.charAt(i+1)){
				count++;
				if(i==str.length()-2){
					strb.append(str.charAt(i));
					strb.append(++count);
				}
			}
			else{
				strb.append(str.charAt(i));
				strb.append(++count);
				count=0;
			}
		}
		
		return strb.toString();
	}
}
