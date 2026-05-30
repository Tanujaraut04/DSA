import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length:");
		int len=s.nextInt();
		int[]arr=new int[len];
		System.out.println("Enter Elemets:");
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
/*op:
Enter Length:
6
Enter Elemets:
8 2 4 5 6 0
[0, 2, 4, 5, 6, 8]
TC:O(n^2)
Worst ,Best,Avg case*/