import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row:");
		int row=s.nextInt();
		System.out.println("Enter Cols:");
		int cols=s.nextInt();
		int[][]arr=new int[row][cols];
		boolean istoeplitz=true;
		System.out.println("Enter Elements:");
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr[0].length-1;j++){
				if(arr[i][j]!=arr[i+1][j+1]){
					istoeplitz=false;
					break;
				}
			}
			if(!istoeplitz){
				break;
			}
		}
		System.out.println(istoeplitz);
	}
}

