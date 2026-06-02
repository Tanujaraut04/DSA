import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int row=s.nextInt();
		int cols=s.nextInt();
		row=row-1;
		cols=cols-1;
		int numerator=1;
		int pro2=1;
		int pro1=1;
		for(int i=row;i>0;i--){
			numerator=numerator*i;
		}
		for(int i=row-cols;i>0;i--){
			pro1=pro1*i;
		}
		
		for(int i=cols;i>0;i--){
			pro2=pro2*i;
		}
		System.out.println(numerator/(pro1*pro2));
		
		
		
	}
}