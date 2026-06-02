import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n-i;j++){
				System.out.print("=");
				}
			for(int j=1;j<=i;j++){
				System.out.print(ncr(i,j)+" ");
			}System.out.println();
		}
	}
		static int ncr(int row,int col){
			int ans=1;
			for(int i=col;i>=1;i--){
				ans=ans*row;
				ans=ans/i;
			}
		return ans;
		}
	
}