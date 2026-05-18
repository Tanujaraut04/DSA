import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Length:");
		int len=s.nextInt();
		System.out.println("Enter Elements:");
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		HashSet<Integer>hs=new HashSet<>();
		int index=0;
		for(int i=0;i<arr.length;i++){
			if(!hs.contains(arr[i])){
				hs.add(arr[i]);
				arr[index]=arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}