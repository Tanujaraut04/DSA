import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length:");
		int len=s.nextInt();
		System.out.println("Enter Elements:");
		int[]arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}int num=0;int rev=0;
		for(int i=0;i<arr.length;i++){
			 rev=rev*10+arr[i];
			
		}
		System.out.println(++rev);
		num=rev;
		int n_arr_size=0;
		while(num>0){
			int rem=num%10;
			n_arr_size++;
			num=num/10;
		}
		System.out.println(n_arr_size);
		int[]n_arr=new int[n_arr_size];
		for(int i=n_arr_size-1;i>=0;i--){
			int rem=rev%10;
			n_arr[i]=rem;
			rev=rev/10;
			}
			System.out.println(Arrays.toString(n_arr));
		}
	
}