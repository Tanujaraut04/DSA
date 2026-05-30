import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int cnt=0;
		for(int i=1;i<=3;i++){
			for(int j=i;j<=num*num;j++){
				if(i%2==1){
					if(i==j||j==cnt+1){
						cnt+=4;
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
					if(i==j||j==cnt){
						cnt=j+2;
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}cnt=0;
			System.out.println();
	
		}	
	}
}