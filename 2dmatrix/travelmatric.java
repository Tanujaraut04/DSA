import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter Row:");
		int row=s.nextInt();
		System.out.println("Enter Col:");
		int col=s.nextInt();
		int[][]arr=new int[row][col];
		System.out.println("Enter Elements:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				arr[i][j]=s.nextInt();
			}
		}
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[0].length;j++){
			if(i+j<col-1){
			System.out.println(arr[i][j]);
				}
			}
		}
	for(int i=arr.length-1;i>=0;i--){
		for(int j=0;j<arr[0].length;j++){
			if(i+j==col-1){
				System.out.println(arr[i][j]);
				}
			}
		}
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[0].length;j++){
			if(i+j>=col){
				System.out.println(arr[i][j]);
				}
			}
		}
	
	}
}