import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row:");
		int row=s.nextInt();
		System.out.println("Enter Columns:");
		int col=s.nextInt();
		int mid=row/2;
		int[][]arr=new int[row][col];=
		System.out.println("Enter Elements:");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<mid;i++){
			for(int j=i;j<arr[0].length-i;j++){
				System.out.print(arr[i][j]);
			}
			for(int j=i+1;j<arr.length-i;j++){
				System.out.print(arr[j][arr[0].length-i-1]);
			}
			for(int j=arr[0].length-i-2;j>=i;j--){
				System.out.print(arr[arr.length-i-1][j]);
			}
			for(int j=arr.length-i-2;j>i;j--){
				System.out.print(arr[j][i]);
			}
		}
		
	}
}