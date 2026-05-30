import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num:");
		int num=s.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num-i;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(i==j||j==1||i==num){
			             System.out.print("* ");
				}else{
				     System.out.print("  ");
				}
			}System.out.println();
		}
	}
}
/*op:
Enter num:
5
    *
   * *
  *   *
 *     *
* * * * *
*/