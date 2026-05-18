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
			}
		}
		for(int i=0;i<row;i++){
			int sum=0;
			for(int j=0;j<cols;j++){
				sum=sum+arr[j][i];
			}System.out.println(sum);
			
		}
		
	}
}