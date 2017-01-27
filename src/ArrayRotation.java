
public class ArrayRotation {

	public static void main(String args[]){
	int M[][] =  new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
		
			System.out.print(M[i][j] + " ");
			
		}
		System.out.println();
	}
	ArrayRotation arrRot = new ArrayRotation();
	arrRot.arrRotation(M);
	}

	public void arrRotation(int[][] M){
		int Num_of_Level = 2;
		int last = 3;
		int level = 0;
		while(level<Num_of_Level){
			for(int i=level;i<last;i++){
				
				int temp  = M[level][i];
				M[level][i] = M[i][last];
				M[i][last] = temp;
				//swap(M[level][i],M[i][last]);
				int temp1  = M[level][i];
				M[level][i] = M[last][last-i+level];
				M[last][last-i+level] = temp1;
				//swap(M[level][i],M[last][last-i+level]);
				int temp2  = M[level][i];
				M[level][i] = M[last-i+level][level];
				M[last-i+level][level] = temp2;
				//swap(M[level][i],M[last-i+level][level]);
			}
			
			++level;
			--last;
		}
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
			
				System.out.print(M[i][j] + " ");
				
			}
			System.out.println();
		}
	}
	public void swap(int m1,int m2){
		
		int temp = m1;
		m1 = m2;
		m2= temp;
	}
	
}
