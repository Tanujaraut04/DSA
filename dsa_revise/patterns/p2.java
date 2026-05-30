import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num:");
		int num=s.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j=1;j<=(2*num)-(i*2);j++){
				 System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				 System.out.print("*");
				}
		System.out.println();
		}
		for(int i=num-1;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int j=1;j<=(2*num)-(i*2);j++){
				 System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				 System.out.print("*");
				}
		System.out.println();
		}
	}
}
/*op:
Enter num:
4
*      *
**    **
***  ***
********
***  ***
**    **
*      *
*/