import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Len:");
		int len=s.nextInt();
		int[]arr=new int[len];
		System.out.println("Enter Elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		divide_call(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static void divide_call(int[]arr,int low,int high){
		if(low==high){
			return;
		}
		int mid=(low+high)/2;
		divide_call(arr,low,mid);
		divide_call(arr,mid+1,high);
		merge_sort(arr,low,mid,high);
	}
	static void merge_sort(int[]arr,int low,int mid,int high){
		int[]n_arr=new int[high-low+1];
		int left=low;
		int right=mid+1;
		int point=0;
		while(left<=mid&&right<=high){
		if(arr[left]<arr[right]){
			n_arr[point]=arr[left];
			left++;
			point++;
		}else{
			n_arr[point]=arr[right];
			right++;
			point++;
			}
		}
		while(left<=mid){
			n_arr[point]=arr[left];
			left++;
			point++;
		}
		while(right<=high){
			n_arr[point]=arr[right];
			right++;
			point++;
		}
		for(int i=0;i<n_arr.length;i++){
			arr[low+i]=n_arr[i];
		}
		System.out.println(Arrays.toString(arr));
	}
}
/*
op:
Enter Len:
5
Enter Elements:
7 3 2 5 6
[2, 3, 5, 6, 7]
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n log n)
Space-complexity:O(n)
*/