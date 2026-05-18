import java.util.*;
class  Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length:");
		int len=s.nextInt();
		System.out.println("Enter Elements:");
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		int index=1;
		for(int i=1;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				arr[index]=arr[i+1];
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
}