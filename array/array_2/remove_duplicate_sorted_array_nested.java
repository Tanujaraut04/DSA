import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length:");
		int len=s.nextInt();
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]&&arr[j]>0){
					arr[j]=0;
				}
			}
		}
		int index=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=0){
				int temp=arr[index];
				arr[index]=arr[i];
				arr[i]=temp;
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}