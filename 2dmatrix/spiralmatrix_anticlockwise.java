import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row:");
		int row=s.nextInt();
		System.out.println("Enter Cols:");
		int col=s.nextInt();
		int[][]arr=new int[row][col];
		int mid=row/2;
		System.out.println("Enter Elements:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<mid;i++){
			for(int j=col-1-i;j>=i;j--){
				System.out.println(arr[i][j]);
			}
			for(int j=i+1;j<row-i;j++){
				System.out.println(arr[j][i]);
			}
			for(int j=i+1;j<col-i;j++){
				System.out.println(arr[row-1-i][j]);
			}
			for(int j=row-2-i;j>i;j--){
				System.out.println(arr[j][col-1-i]);
			}
		}
	}
}