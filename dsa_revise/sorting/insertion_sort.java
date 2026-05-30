import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length");
		int len=s.nextInt();
		int[] arr =new int[len];
		System.out.println("Enter Elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		for(int i=1;i<arr.length;i++){
			int key=arr[i];
			int left=i-1;
			while(left>=0&&arr[left]>=key){
				arr[left+1]=arr[left];
				left--;					
				}
				arr[left+1]=key;
			}
			
		
		System.out.println(Arrays.toString(arr));
	}
}
/*op:
Enter Length
5
Enter Elements:
7 3 5 2 6
[2, 3, 5, 6, 7]
tc=O(n^2)worst and avg
best=O(n)*/
