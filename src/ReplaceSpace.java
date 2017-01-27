public class ReplaceSpace {

	public static void main(String[] args) {
	ReplaceSpace spc = new ReplaceSpace();
	
	String str1 = "hi how   are you          ";
	System.out.println(spc.replaceWithString(str1));
	
}

public String replaceWithString(String str1){
	
	char[] chrArr = str1.toCharArray();
	int length = chrArr.length;
	int spcCount=0,length1=0,length2 = 0;
	boolean flag = false;
	for(int i=chrArr.length-1;i>=0;i--){
		if(chrArr[i]!=' ' || flag){
			if(!flag){
					length1 = i;	
			}		
			flag = true;
			if(chrArr[i]==' '){
				spcCount++;
			}
		}
		
	}
	
	//int new_length = length + spcCount * 2;
	
	//chrArr[new_length-1] = '\0';
	for(int j=length1;j>=0;j--)
	{
		if(chrArr[j]==' '){
			--spcCount;
			chrArr[j+spcCount * 2] = '%';
			chrArr[(j+spcCount * 2)+1] = '2';
			chrArr[(j+spcCount * 2)+2] = '0';
		}
		else{
			chrArr[j+spcCount*2] = chrArr[j];
			//System.out.println(j+spcCount*2);
		}
		
	}
	
	//System.out.println();
	String str = new String(chrArr);
	for(int i=chrArr.length-1;i>=0;i--){
		if(chrArr[i]!=' '){
			length2 = i;
			break;
		}
	}
	System.out.println("Old Length " + length1);
	System.out.println("New Length " + length2);
	return str;
}

}