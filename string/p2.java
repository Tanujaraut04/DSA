/*How to string store in memory
1.Point the same address
2.only 1 object create
3.Store in SCP
*/
class Demo{
	public static void main(String[]args){
		String s1 = "Tanuja";
		String s2 = "Tanuja";
		System.out.println(s1);
		System.out.println(s2);
	}
}