import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Row:");
		int row=s.nextInt();
		System.out.println("Enter the Cols:");
		int cols=s.nextInt();
		row=row-1;
		cols=cols-1;
		int ans=1;
		for(int i=0;i<cols;i++){
			ans=ans*(row-i);
			ans=ans/(i+1);
		}System.out.println("Output:"+ans);
		
	}
}