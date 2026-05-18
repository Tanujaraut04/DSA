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
		}int large=0;
		for(int j=0;j<arr.length;j++){
			for(int i=0;i<arr[0].length;i++){
				if(arr[j][i]>large){
					large=arr[j][i];
					}
				}
			}
		System.out.println("Large:"+large);
		}
}