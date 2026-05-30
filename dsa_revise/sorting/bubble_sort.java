import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length:");
		int len=s.nextInt();
		System.out.println("Enter Element:");
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		int last=arr.length-1;
		while(0<last){
			for(int i=0;i<last;i++){
				if(arr[i]>arr[i+1]){
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}last--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
/*op:
Enter Length:
5
Enter Element:
9 5 6 1 3
[1, 3, 5, 6, 9]
tc=O(n^2)*/