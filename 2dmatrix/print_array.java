import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row:");
		int row=s.nextInt();
		System.out.println("Enter Column:");
		int cols=s.nextInt();
		int[][]arr=new int[row][cols];
		System.out.println("Enter Elements:");
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
				arr[i][j]=s.nextInt();
			}System.out.println();
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<cols;j++){
			System.out.print(arr[i][j]);	
			}
			System.out.println();
		}
		
	}
}