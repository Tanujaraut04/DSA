import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int ip=s.nextInt();
		int mid=(ip+1)/2;
		for(int i=1;i<=ip;i++){
			System.out.print("*");
		}System.out.println();
		int i=2;
		int cnt=i+mid;
		int temp=cnt;
		for(;i<=mid;i++){
			for(int j=1;j<=ip;j++){
				if(i+j>=cnt&&i+j<=temp){
					System.out.print("=");
				}else{
					System.out.print("*");
				}
			}temp+=2;
			System.out.println();
		}
		cnt+=4;
		for(int k=ip;k>=mid+1;k--){
			for(int j=1;j<=ip;j++){
				if(k+j>=cnt&&k+j<=temp){
					System.out.print("=");
				}else{
					System.out.print("*");
				}
			}temp-=2;
			System.out.println();
		}
		
	}
}